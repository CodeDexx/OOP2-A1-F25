/**
 *
 *
 */
package com.champlain.oop2a1;

import java.time.LocalDate;

public class Person {
    private final String aName;
    private final LocalDate aBirthDate;
    private final String aEmailAddress;
    private boolean aHasParkingPass = false;

    /**
     *
     * @return
     */
    public Person(String pName, LocalDate pBirthDate, String pEmailAddress) {
        if (pName == null || pName.isEmpty()) {
            throw new IllegalArgumentException("The name field is wrong!");
        }
        if  (pBirthDate == null || pBirthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("The Birth Date field is wrong!");
        }
        if  (pEmailAddress == null || !pEmailAddress.contains("@")) {
            throw new IllegalArgumentException("The Email field is wrong!");
        }

        this.aName = pName;
        this.aBirthDate = pBirthDate;
        this.aEmailAddress = pEmailAddress;
    }
    /**
     *
     * @return
     */
    public boolean purchaseParkingPass() {
        if (aHasParkingPass) return false;
        aHasParkingPass = true;
        return true;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.aName;
    }
    /**
     *
     * @return
     */
    public LocalDate getDOB() {
        return this.aBirthDate;
    }
    /**
     *
     * @return
     */
    public String getEmailAddress() {
        return this.aEmailAddress;
    }
    /**
     *
     * @return
     */
    public boolean isPurchasedParkingPass() {
        return this.aHasParkingPass;
    }
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.aName + " (" + this.aBirthDate + ", " + this.aEmailAddress + ")";
    }

}
