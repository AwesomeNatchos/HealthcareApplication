package com.awesomenatchos;

/*
USERS:
    Administration
    Doctor
    Patient
    Family members
* */

public class Users {
    int userID;
    String firstName;
    String lastName;
    String userPassword;
    int dateOfBirth;
    String address;
    Boolean gender = null; //administration user dont need
                            // true = female

    //CONSTRUCTOR
    public Users(int userID, String firstName, String lastName, String userPassword, int dateOfBirth, String address, Boolean gender) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userPassword = userPassword;

        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
    }

    //GETTERS
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        if(gender == true){
            return "F";
        }
        else if(gender == false){
            return "M";
        }
        else{
            return null;
            //In case of admin
        }
    }
    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}