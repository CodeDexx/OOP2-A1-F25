package com.champlain.oop2a1;

import java.time.LocalDate;

public class Person {
    private final String aName;
    private final LocalDate aBirthDate;
    private final String aEmailAddress;
    private boolean aHasParkingPass = false;

    public Person(String pName, LocalDate pBirthDate, String pEmailAddress) {
        this.aName = pName;
        this.aBirthDate = pBirthDate;
        this.aEmailAddress = pEmailAddress;
    }
    public boolean purchaseParkingPass() {
        this.aHasParkingPass = true;
        return true;
    }
    public String getName() {
        return this.aName;
    }
    public LocalDate getDOB() {
        return this.aBirthDate;
    }
    public String getEmailAddress() {
        return this.aEmailAddress;
    }
    public boolean isPurchasedParkingPass() {
        return this.aHasParkingPass;
    }
    @Override
    public String toString() {
        return this.aName + " (" + this.aBirthDate + ", " + this.aEmailAddress + ")";
    }

}
