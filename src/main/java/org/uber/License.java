package org.uber;

public class License {
    private String licenseNo;
    private String dateOfIssue;
    private String name;
    private String nationality;
    private String validity;

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public boolean verifyDetails(License license) {
        if (this.licenseNo != null && this.licenseNo.equals(license.getLicenseNo()) &&
                this.name != null && this.name.equals(license.getName()) &&
                this.nationality != null && this.nationality.equals(license.getNationality()) &&
                this.validity != null && this.validity.equals(license.getValidity()) &&
                this.dateOfIssue != null && this.dateOfIssue.equals(license.getDateOfIssue())) {
            return true;
        }
        return false;
    }
}
