package com.awesomenatchos;

public class Doctor extends Users{
    int drLisenceID;
    String bloodType;

    public Doctor(int userID, String firstName, String lastName, String userPassword, int dateOfBirth, String address, Boolean gender, int drLisenceID, String bloodType) {
        super(userID, firstName, lastName, userPassword, dateOfBirth, address, gender);
        this.drLisenceID = drLisenceID;
        this.bloodType = bloodType;

    }

    //GETTERS AND SETTERS

    public int getDrLisenceID() {
        return drLisenceID;
    }

    public void setDrLisenceID(int drLisenceID) {
        this.drLisenceID = drLisenceID;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

}
