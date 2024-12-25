package org.uber.services;

import java.util.*;

public class UberApp {
    private Map<String, List<Driver>> listOfdriver = new HashMap<>();
    private List<Driver> driverList = new ArrayList<>();
    private List<Rider> riderList = new ArrayList<>();
    private Map<Long, Integer> hourKilometer = new HashMap<>();
    private Map<Date, Vehicle> availableVehicle = new HashMap<>();

    public Map<Date, Vehicle> getAvailableCabs() {
        return availableVehicle;
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }

    public List<Rider> getRiderList() {
        return riderList;
    }

    public void setRiderList(List<Rider> riderList) {
        this.riderList = riderList;
    }

    public void setAvailableCabs(Map<Date, Vehicle> availableVehicle) {
        this.availableVehicle = availableVehicle;
    }

    public Map<String, List<Driver>> getListOfdriver() {
        return listOfdriver;
    }

    public void setListOfdriver(Map<String, List<Driver>> listOfdriver) {
        this.listOfdriver = listOfdriver;
    }

    public Map<Long, Integer> getHourKilometer() {
        return hourKilometer;
    }

    public void setHourKilometer(Map<Long, Integer> hourKilometer) {

        hourKilometer.put(1L, 15);
        hourKilometer.put(2L, 30);
        hourKilometer.put(4L, 40);
        hourKilometer.put(8L, 80);
        hourKilometer.put(10L, 100);
        this.hourKilometer = hourKilometer;

    }

    public void signUpasRider() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter phoneNumber: ");
        String phoneNo = scanner.next();
        System.out.println("Enter otp: ");
        int otp = generateOTP();
        System.out.println("Enter city: ");
        String city = scanner.next();
        int Riderotp = scanner.nextInt();
        Rider rider = new Rider(name, phoneNo);
        if (otp == Riderotp) {
            riderList.add(rider);
        } else {
            System.out.println("Otp is invalid..");
        }

    }

    public void signUpasDriver() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name");
        String name = scanner.next();
        System.out.println("Enter phone number");
        String phoneNo = scanner.next();
        System.out.println("Enter vehicle name");
        String vehicleName = scanner.next();
        Vehicle vehicle = null;
        if (vehicleName.equals("AUTO"))
            vehicle = new Auto();
        else if (vehicleName.equals("CAB"))
            vehicle = new Cab();
        else if (vehicleName.equals("BIKE"))
            vehicle = new Bike();
        System.out.println("Enter license number");
        String licenseno = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();

        Driver driver = new Driver(name, phoneNo, licenseno, vehicle, city);
        int otp = generateOTP();
        System.out.println("Enter opt");
        int driverotp = scanner.nextInt();
        if (otp == driverotp && driver.uploadLicenseDetails()) {
            driverList.add(driver);
            List<Driver> list = listOfdriver.getOrDefault(listOfdriver.get(city), new ArrayList<>());
            list.add(driver);
            listOfdriver.put(city, list);
        } else {
            System.out.println("Otp is invalid..");
        }
        driverList.add(driver);
    }


    public void loginAsDriver() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phoneNumber: ");
        String phoneNo = scanner.next();
        System.out.println("Enter otp: ");
        int otp = scanner.nextInt();
        int driverotp = generateOTP();
        Driver driver = null;
        if (otp == driverotp) {
            driver = driverList.stream().filter(driver1 -> driver1.getPhoneNumber().equals(phoneNo)).findFirst().orElse(null);
        } else {
            System.out.println("Otp is invalid..");
        }
        if (driver == null)
            System.out.println("User doesnt exit");
        else
            System.out.println("Logged in successfully");

    }

    public void loginAsRider() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phoneNumber: ");
        String phoneNo = scanner.next();
        System.out.println("Enter otp: ");
        int riderotp = generateOTP();
        int otp = scanner.nextInt();
        Rider rider = null;
        if (otp == riderotp) {
            rider = riderList.stream().filter(rider1 -> rider1.getPhoneNo().equals(phoneNo)).findFirst().orElse(null);
        } else {
            System.out.println("Otp is invalid..");
        }
        if (rider == null)
            System.out.println("User doesnt exit");
        else
            System.out.println("Logged in successfully");
    }


    public Driver findDriverinCity(Location riderLocation, String city, Vehicle vehicle) {
        List<Driver> driverlist = getListOfdriver().get(city);
        Driver availableDriver = new Driver();
        double mindistance = Double.MAX_VALUE;
        for (Driver driver : driverlist) {
            Location driverlocation = driver.getLocation();
            double distance = calculateDistance(driverlocation, riderLocation);
            if (distance < mindistance && driver.getVehicle() == vehicle) {
                availableDriver = driver;
            }

        }
        return availableDriver;

    }

    double calculateDistance(Location driverlocation, Location riderLocation) {
        double lat1 = driverlocation.getLatitude();
        double lon1 = driverlocation.getLongitude();
        double lat2 = riderLocation.getLatitude();
        double lon2 = riderLocation.getLongitude();
        return Math.sqrt(Math.pow(lat1 - lat2, 2) + Math.pow(lon1 - lon2, 2));

    }

    public void requestRide(Rider rider) throws DestinationNotWithCityException {
        System.out.println("Drop the pin in the pickup Location / Detect current location");
        Location currentLocation = rider.detectCurrentLocation();
        System.out.println("Drop the pin in the drop Location");
        Scanner scanner = new Scanner(System.in);
        double latitude = scanner.nextDouble();
        double longitude = scanner.nextDouble();
        Location destination = new Location(latitude, longitude);
        String city = destination.getCurrentCity();
        if (currentLocation.getCity().equals(city)) {
            Vehicle vehicle = rider.bookRide(currentLocation, destination);
            Driver driver = findDriverinCity(currentLocation, city, vehicle);
            double distance = calculateDistance(currentLocation, destination);
            int otp = generateOTP();
            long startTime = System.currentTimeMillis() / 60000;
            long estimatedTime = estimatedTime(distance, startTime);
            Ride ride = new Ride(rider, driver, RideStatus.BOOKED, otp, vehicle, distance, currentLocation, startTime, estimatedTime);
            Observer driverObserver = new DriverObserver(driver, ride);
            Observer riderObserver = new RiderObserver(driver, ride);
            driverObserver.update(driver, ride);
            riderObserver.update(driver, ride);
            if (ride.getRideStatus().equals(RideStatus.ACCEPTED)) {
                if (driver.startTheRide(rider, driver)) {
                    ride.setRideStatus(RideStatus.ONGOING);
                }
            } else {
                System.out.println("Book a different ride..!");

            }
            tracktheTrip(rider, driver, ride, destination);
        }
        throw new DestinationNotWithCityException("Destination is too far from the city");


    }

    private long estimatedTime(double distance, long startTime) {
        return (long) (startTime + distance);
    }

    public void PickAndDropCourier(Rider rider) throws DestinationNotWithCityException {
        System.out.println("Drop the pin in the pickupLocation / Detect current locatoin");
        Location currentLocation = rider.detectCurrentLocation();
        System.out.println("Drop the pin in the dropLocation");
        Scanner scanner = new Scanner(System.in);
        double latitude = scanner.nextDouble();
        double longitude = scanner.nextDouble();
        Location destination = new Location(latitude, longitude);
        System.out.println("Enter the courier..!");
        int parcelId = scanner.nextInt();
        Courier courier1 = new Courier(parcelId, destination);
        String city = destination.getCurrentCity();
        if (currentLocation.getCity().equals(city)) {
            Vehicle vehicle = rider.bookRide(currentLocation, destination);
            Driver driver = findDriverinCity(currentLocation, city, vehicle);
            double distance = calculateDistance(currentLocation, destination);
            int otp = generateOTP();
            long startTime = System.currentTimeMillis() / 60000;
            long estimatedTime = estimatedTime(distance, startTime);
            Ride ride = new Ride(rider, driver, RideStatus.BOOKED, otp, vehicle, distance, currentLocation, startTime, estimatedTime);
            Observer driverObserver = new DriverObserver(driver, ride);
            driverObserver.update(driver, ride);
            if (ride.getRideStatus().equals(RideStatus.ACCEPTED)) {
                if (driver.startTheRide(rider, driver)) {
                    ride.setRideStatus(RideStatus.ONGOING);
                }
            } else {
                System.out.println("Book a different ride..!");

            }
            tracktheCourier(driver, ride, destination, courier1);
        }
        throw new DestinationNotWithCityException("Destination is too far from the city");
    }


    public void tracktheTrip(Rider rider, Driver driver, Ride ride, Location destination) {
        while (ride.detectCurrentLocation() != destination) {
            ride.setRideStatus(RideStatus.ONGOING);
        }
        driver.completeRide(rider, driver);
    }

    public void tracktheCourier(Driver driver, Ride ride, Location destination, Courier courier) {
        while (ride.detectCurrentLocation() != destination) {
            ride.setRideStatus(RideStatus.ONGOING);
        }
        driver.deliveredCourier(driver, courier, destination);
    }

    public void hourlyRental(Rider rider) throws RentalHourExceededException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select package");
        System.out.println("Enter the number of hours");
        long hour = scanner.nextLong();
        int kilometer = hourKilometer.get(hour);
        System.out.println("Choose the vehicle: ");
        String vehicle = scanner.next();
        Vehicle vehicle1;

        if (vehicle.equals("AUTO")) {
            vehicle1 = new Auto();
            double cost = vehicle1.cost(kilometer);
            System.out.println(cost);
        } else if (vehicle.equals("CAR")) {
            vehicle1 = new Cab();
            double cost = vehicle1.cost(kilometer);
            System.out.println(cost);
        } else {
            vehicle1 = new Bike();
            double cost = vehicle1.cost(kilometer);
            System.out.println(cost);

        }
        Location currentLocation = rider.detectCurrentLocation();
        long startTime = System.currentTimeMillis() / 60000;
        long endtime = hour + startTime;
        vehicle1.setRideStatus(RideStatus.ONGOING);
        Ride ride = new Ride(rider, RideStatus.BOOKED, vehicle, kilometer, currentLocation, startTime, endtime);
        startRide(startTime, endtime, ride);
        if (ride.getRideStatus().equals(RideStatus.COMPLETED)) {
            Observer driverObserver = new DriverObserver(vehicle1.getDriver(), ride);
            Observer paymentObserver = new PaymentObserver(vehicle1.getDriver(), ride);
            driverObserver.update(vehicle1.getDriver(), ride);
            paymentObserver.update(vehicle1.getDriver(), ride);
        } else {
            throw new RentalHourExceededException("Rental hour is getting exceeded..!");
        }

    }

    public void startRide(long startTime, long endtime, Ride ride) {
        long time = System.currentTimeMillis();
        while (time != endtime) {
            ride.setRideStatus(RideStatus.ONGOING);
            time = System.currentTimeMillis() / 60000;
        }
        if (time == endtime)
            ride.setRideStatus(RideStatus.COMPLETED);

    }


    public void outStationTrips(Rider rider) {
        System.out.println("Drop the pin in the pickup Location / Detect current location");
        Location currentLocation = rider.detectCurrentLocation();
        System.out.println("Drop the pin in the drop Location");
        Scanner scanner = new Scanner(System.in);
        double latitude = scanner.nextDouble();
        double longitude = scanner.nextDouble();
        Location destination = new Location(latitude, longitude);
        String city = destination.getCurrentCity();
        Vehicle vehicle = rider.bookRide(currentLocation, destination);
        Driver driver = findDriverinCity(currentLocation, city, vehicle);
        double distance = calculateDistance(currentLocation, destination);
        int otp = generateOTP();
        long startTime = System.currentTimeMillis() / 60000;
        long estimatedTime = estimatedTime(distance, startTime);
        Ride ride = new Ride(rider, driver, RideStatus.BOOKED, otp, vehicle, distance, currentLocation, startTime, estimatedTime);
        Observer driverObserver = new DriverObserver(driver, ride);
        Observer riderObserver = new RiderObserver(driver, ride);
        driverObserver.update(driver, ride);
        riderObserver.update(driver, ride);
        if (ride.getRideStatus().equals(RideStatus.ACCEPTED)) {
            if (driver.startTheRide(rider, driver)) {
                ride.setRideStatus(RideStatus.ONGOING);
            }
        } else {
            System.out.println("Book a different ride..!");

        }
        tracktheTrip(rider, driver, ride, destination);


    }


    public int generateOTP() {
        int random = new Random().nextInt(9999) + 1000;
        return random;

    }
}
