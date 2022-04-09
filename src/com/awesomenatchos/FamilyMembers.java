package com.awesomenatchos;

public class FamilyMembers extends Users {
    String bloodType;


    public FamilyMembers(int userID, String firstName, String lastName, String userPassword, int dateOfBirth, String address, Boolean gender, String bloodType) {
        super(userID, firstName, lastName, userPassword, dateOfBirth, address, gender);
        this.bloodType = bloodType;

    }

    //GETTERS AND SETTERS

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}

