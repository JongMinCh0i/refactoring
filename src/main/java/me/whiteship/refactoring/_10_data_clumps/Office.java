package me.whiteship.refactoring._10_data_clumps;

import me.whiteship.refactoring._07_divergent_change._26_extract_class.TelephoneNumber;

public class Office {

    private String location;
    private TelephoneNumber officePhoneNumber;

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return this.officePhoneNumber.toString();
    }

    public String getOfficeAreCode() {
        return this.officePhoneNumber.getAreaCode();
    }

    public void setOfficeAreCode(String officeAreCode) {
        this.officePhoneNumber.setAreaCode(officeAreCode);
    }

    public String getOfficeNumber() {
        return this.officePhoneNumber.getNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.officePhoneNumber.setNumber(officeNumber);
    }
}
