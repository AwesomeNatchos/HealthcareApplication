package com.awesomenatchos;

public class Patient extends Users{

    String bloodType;

    //Object patientdoctor;

    public Patient(int userID, String firstName, String lastName, String userPassword, int dateOfBirth, String address, Boolean gender, String bloodType) {
        super(userID, firstName, lastName, userPassword, dateOfBirth, address, gender);
        this.bloodType = bloodType;


    }



    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }


}
