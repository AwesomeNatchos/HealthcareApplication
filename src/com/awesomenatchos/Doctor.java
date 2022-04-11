package com.awesomenatchos;

public class Doctor extends Users{
    int drLisenceID;

    public Doctor(int loginClass, int userID, String userPassword, String firstName, String lastName, int dateOfBirth, String address, Boolean gender, com.awesomenatchos.BloodType BloodType, int drLicenceID) {
        super(loginClass, userID, userPassword, firstName, lastName, dateOfBirth, address, gender, BloodType);
        this.drLisenceID = drLicenceID;
    }



//GETTERS AND SETTERS

    public int getDrLisenceID() {
        return drLisenceID;
    }

    public void setDrLisenceID(int drLisenceID) {
        this.drLisenceID = drLisenceID;
    }


}
