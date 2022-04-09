package com.awesomenatchos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ApplicationMain {
    public static int mainMenuPatient() {
        Scanner scan = new Scanner(System.in);

        System.out.println("    WELCOME TO HEALTH");
        System.out.println("---------MENU--------");
        System.out.println("Options:");
        System.out.println(" 1. Diary");
        System.out.println(" 2. See personal data");
        System.out.println(" 3. See medical info");
        System.out.println(" 4. Exit");
        System.out.println("Please enter your option: ");
        int userOption = scan.nextInt();
        return userOption;
    }
    public static void saveToFile(String filePath, String diaryEntry, boolean append) {
        System.out.println("Save to file: ");
        try{
            File f = new File(filePath);
            FileWriter fw = new FileWriter(f,append);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(diaryEntry);
            pw.close();
        } catch (IOException e) {
            System.out.println("Error: save to file");
        }
    }
    public static void diaryMainMenu(Users userName) throws IOException {
        boolean diary = true;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("----- DIARY-----");
            System.out.println("Name " + userName.firstName + " " + userName.getLastName());
            System.out.println("\n1. Write in diary: ");
            System.out.println("2. Read Diary");
            System.out.println("3. Main menu");

            int userOption3 = scan.nextInt();

            switch (userOption3){
                case 1:
                    Scanner scan4 = new Scanner(System.in);
                    File file = new File("C:\\Users\\Natcha\\IdeaProjects\\bankingApplication\\src\\com\\awesomenatchos\\Diary.txt");
                    FileWriter fw = new FileWriter(file);
                    PrintWriter pw = new PrintWriter(fw);

                    System.out.println("---Write in diary-----");
                    System.out.println("Write: ");
                    String diaryEntry = scan4.nextLine();
                    System.out.println();
                    //Save entry to diary into file
                    saveToFile(file.getPath(),diaryEntry, false);
                    diaryMainMenu(userName);
                    break;
                case 2:
                    System.out.println("---Reading Diary----");
                    File file2 = new File("C:\\Users\\Natcha\\IdeaProjects\\bankingApplication\\src\\com\\awesomenatchos\\Diary.txt");
                    Scanner scan1 = new Scanner(file2);
                    while(scan1.hasNextLine()){
                        System.out.println(scan1.nextLine());
                    }
                    diaryMainMenu(userName);
                    break;
                case 3:
                    diary = false;
                    break;

                default:
                    System.out.println("Try a valid option!");
            }
        } while (diary);
}
    public static void personalData(Users userName) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\"----Personal INFO-----\n");
        System.out.println("UserID: " + userName.getUserID());
        System.out.println("First name: " + userName.getFirstName());
        System.out.println("Family name: " + userName.getLastName());
        System.out.println("Date of birth (year): " + userName.getDateOfBirth());
        System.out.println("Address: " + userName.getAddress());
        System.out.println("\nOptions: ");
        System.out.println(" 1. Retrieve password");
        System.out.println(" 2. Main menu");
        System.out.println(" 3. Exit ");
        boolean info = true;
        do{
            int userOption2 = scan.nextInt();
            switch(userOption2) {
                case 1:
                    System.out.println("Your password: " + userName.getUserPassword());

                    break;
                case 2:
                    mainMenuPatient();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    info = false;
            }

        }while(info);

    }
    public static void medicalData(Users userName) {
        System.out.println("------MEDICAL INFO----");
        System.out.println("First name: " + userName.getFirstName());
        System.out.println("Last name: " + userName.getLastName());
        System.out.println("Date of birth: " + userName.getDateOfBirth());
        System.out.println("Gender " + userName.getGender());
    }

    public static void main(String[] args) throws IOException {

        //List
        ArrayList<Patient> patientArrayList = new ArrayList<>();
        ArrayList<Doctor> doctorArrayList = new ArrayList<>();
        ArrayList<Users> adminsArrayList = new ArrayList<>();

        //Creat admin, doctor, patient, and add them to their list
        Users admin1 = new Users(123, "Natcha", "Uthaug", "q", 1991, "Fanahammaren 24j", true);
        Patient patient1 = new Patient(222,"Nina", "Raknes","m",1960,"Sakkviksveien 4",true, "A");
        Doctor doctor1 = new Doctor(333,"Manny", "McKnotty","m", 1990, "Brooklyn street 5", false,54134,"B");
        patientArrayList.add(patient1);
        doctorArrayList.add(doctor1);
        adminsArrayList.add(admin1);


        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            int userOption = mainMenuPatient();
            switch (userOption) {
                case 1:
                    diaryMainMenu(admin1);
                    break;
                case 2:
                    personalData(admin1);
                    break;
                case 3:
                    medicalData(admin1);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    flag = false;
                default:
                    System.out.println("Please try a valid option from the menu");
                    break;
            }
        } while (flag);

    }
}