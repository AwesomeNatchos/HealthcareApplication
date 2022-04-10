package com.awesomenatchos;

/*
USERS:
    Administration
    Doctor
    Patient
    Family members
* */

import java.util.Scanner;

public class Users {
    int userID;
    String firstName;
    String lastName;
    String userPassword;
    int dateOfBirth;
    String address;
    Boolean gender = null; //administration user dont need
                            // true = female
    int loginClass = 1;
    String BloodType = null; //Admin does not need

    //CONSTRUCTOR
    public Users( int loginClass, int userID, String userPassword, String firstName, String lastName, int dateOfBirth, String address, Boolean gender, com.awesomenatchos.BloodType BloodType) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userPassword = userPassword;

        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.loginClass = loginClass;
        this.BloodType = String.valueOf(BloodType);
    }

    // FUNCTIONS
    public static Users create_admin_user(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ---- Creat new Admin profile ------");
        System.out.print("First name: ");
        String firstName = scan.nextLine();
        System.out.print("Last name: ");
        String lastName = scan.nextLine();
        System.out.print("UserID: ");
        int userID = scan.nextInt();
        System.out.print("Password: ");
        String password = scan.next();
        System.out.print("Birth year: ");
        int birthYear = scan.nextInt();
        System.out.print("Address: ");
        String address = scan.nextLine();
        System.out.println("You have successfully created a new admin user");
        return new Users(1, userID,password,firstName,lastName,birthYear,address,null,null );
    }

    public static Users create_doctor_user(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ---- Creat new Admin profile ------");
        System.out.print("First name: ");
        String firstName = scan.nextLine();
        System.out.print("Last name: ");
        String lastName = scan.nextLine();
        System.out.print("UserID: ");
        int userID = scan.nextInt();
        System.out.print("Password: ");
        String password = scan.next();
        System.out.print("Birth year: ");
        int birthYear = scan.nextInt();
        System.out.print("Address: ");
        String address = scan.nextLine();
        System.out.println();
        System.out.print("Gender (true = female): ");
        Boolean gender = scan.nextBoolean();
        System.out.print("Doctor licence number: ");
        int licenceNumber = scan.nextInt();
        System.out.println("You have successfully created a new Doctor user");
        return new Doctor(2, userID,password,firstName,lastName,birthYear,address,gender,null, licenceNumber);

    }

    public static Users creat_new_patient(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ---- Creat new Admin profile ------");
        System.out.print("First name: ");
        String firstName = scan.nextLine();
        System.out.print("Last name: ");
        String lastName = scan.nextLine();
        System.out.print("UserID: ");
        int userID = scan.nextInt();
        System.out.print("Password: ");
        String password = scan.next();
        System.out.print("Birth year: ");
        int birthYear = scan.nextInt();
        System.out.print("Address: ");
        String address = scan.nextLine();
        System.out.println();
        System.out.print("Gender (true = female): ");
        Boolean gender = scan.nextBoolean();
        System.out.println("You have successfully created a new Patient user");
        return new Patient(3, userID,password,firstName,lastName,birthYear,address,gender,null );

    }

    public static Users create_new_family(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ---- Creat new Admin profile ------");
        System.out.print("First name: ");
        String firstName = scan.nextLine();
        System.out.print("Last name: ");
        String lastName = scan.nextLine();
        System.out.print("UserID: ");
        int userID = scan.nextInt();
        System.out.print("Password: ");
        String password = scan.next();
        System.out.print("Birth year: ");
        int birthYear = scan.nextInt();
        System.out.print("Address: ");
        String address = scan.nextLine();
        System.out.println();
        System.out.print("Gender (true = female): ");
        Boolean gender = scan.nextBoolean();
        System.out.println("You have successfully created a new Family user");
        return new FamilyMembers(4, userID,password,firstName,lastName,birthYear,address,gender,null);
    }

    public static Users creat_new_user(){
        Scanner scan = new Scanner(System.in);
        Boolean create = true;
        Users admin = null;
        do{
            System.out.println("---- CREATE NEW USER-------");
            System.out.println("Chose usertype: ");
            System.out.println(" 1. Admin ");
            System.out.println(" 2. Doctor ");
            System.out.println(" 3. Patient ");
            System.out.println(" 4. Family ");
            System.out.println(" 5. Exit");
            int userType = scan.nextInt();

            switch (userType){
                case 1:
                     admin = create_admin_user();
                    break;
                case 2:
                    admin = create_doctor_user();
                    break;
                case 3:
                    admin = creat_new_patient();
                    break;
                case 4:
                    admin = create_new_family();
                    break;
                case 5:
                    create = false;
                    break;
                default:
                    System.out.println("Please try a valid option");
                    break;
            }
        } while(create);
        return admin;
    }


    // GETTERS and SETTERS
    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String bloodType) {
        BloodType = bloodType;
    }

    public int getLoginClass() {
        return loginClass;
    }

    public void setLoginClass(int loginClass) {
        this.loginClass = loginClass;
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