/**
 * Represents a person with a name, date of birth, email address, and if they have a parking pass.
 * A person can only purchase a parking pass once.
 */
package com.champlain.oop2a1;

import java.time.LocalDate;

public class Person {
    private final String aName;
    private final LocalDate aBirthDate;
    private final String aEmailAddress;
    private boolean aHasParkingPass = false;

    /**
     * Constructs a new Person with given name, date of birth, and email address.
     *
     * @param pName the person's name
     * @param pBirthDate the person's date of birth
     * @param pEmailAddress the person's email address
     * @throws IllegalArgumentException if any argument is invalid
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
     * Purchases a parking pass for this person if they don't have one.
     * The pass cannot be returned.
     *
     * @return true if pass was successfully purchased, false if already have one.
     */
    public boolean purchaseParkingPass() {
        if (aHasParkingPass) return false;
        aHasParkingPass = true;
        return true;
    }

    /**
     * Gets the person's name.
     *
     * @return the name
     */
    public String getName() {
        return this.aName;
    }
    /**
     * Gets the person's date of birth.
     *
     * @return the date of birth
     */
    public LocalDate getDOB() {
        return this.aBirthDate;
    }
    /**
     * Gets the person's email address.
     *
     * @return the email address
     */
    public String getEmailAddress() {
        return this.aEmailAddress;
    }
    /**
     * Checks if person has already purchased a parking pass.
     *
     * @return tru if the person has a pass, false otherwise
     */
    public boolean isPurchasedParkingPass() {
        return this.aHasParkingPass;
    }
    /**
     * Formats the method to nicely present the text from person.
     *
     * @return a string with the person's name, date of birth, and email address
     */
    @Override
    public String toString() {
        return this.aName + " (" + this.aBirthDate + ", " + this.aEmailAddress + ")";
    }

}
