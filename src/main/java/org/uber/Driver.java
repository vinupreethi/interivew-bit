package org.uber;

import java.util.Date;
import java.util.Scanner;

public class Driver {
    private String name;
    private String phoneNumber;
    private String licenseNo;
    private Location location;
    private UberApp uberApp;
    private int driverId;
    private Vehicle vehicle;
    private Ride ride;
    private Rider rider;
    private String city;
    private RideStatus rideStatus;
    private Date date;
    private String time;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Driver() {

    }

    public Driver(String name, String phoneNumber, String licenseNo, Vehicle vehicle, String city) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.licenseNo = licenseNo;
        this.vehicle = vehicle;
        this.city = city;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public UberApp getUberApp() {
        return uberApp;
    }

    public void setUberApp(UberApp uberApp) {
        this.uberApp = uberApp;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public boolean startTheRide(Rider rider, Driver driver) {
        System.out.println("Enter the otp");
        Scanner scanner = new Scanner(System.in);
        int otp = scanner.nextInt();
        if (rider.getOtp() == otp)
            return true;
        return false;
    }

    public void completeRide(Rider rider, Driver driver) {
        Observer paymentObserver = new PaymentObserver(driver, rider.getRide());
        paymentObserver.update(driver, rider.getRide());
    }

    public void completeRide( Driver driver, Courier courier) {

    }

    public boolean uploadLicenseDetails() {
        Scanner scanner = new Scanner(System.in);
        String upload = scanner.next();
        License license = new License();
        if (upload.equals("TRUE")) {
            license.verifyDetails(license);
            return true;
        }
        return false;

    }
//    public boolean isAvailableForTrip(Driver driver, String time, Date date)
//    {
//
//    }

    public void deliveredCourier(Driver driver, Courier courier,Location destination) {
        if(driver.getLocation()==destination)
        {
            System.out.println("Enter otp");
            Scanner scanner=new Scanner(System.in);
            int otp=scanner.nextInt();
            if(otp== rider.getOtp())
            {
                Observer paymentObserver = new PaymentObserver(driver, driver.getRide());
                paymentObserver.update(driver, rider.getRide());
            }
        }

    }
}
