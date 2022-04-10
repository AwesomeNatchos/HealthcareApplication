package com.awesomenatchos;

public class Patient extends Users{



    //Object patientdoctor;


    public Patient(int loginClass, int userID, String userPassword, String firstName, String lastName, int dateOfBirth, String address, Boolean gender, com.awesomenatchos.BloodType BloodType) {
        super(loginClass, userID, userPassword, firstName, lastName, dateOfBirth, address, gender, BloodType);
    }
}
