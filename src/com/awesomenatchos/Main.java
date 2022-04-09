package com.awesomenatchos;
/*
import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void read_file(){
        try{
            BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\Natcha\\IdeaProjects\\HealthcareApplication\\src\\com\\awesomenatchos\\output.txt"));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void write_file(){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Natcha\\IdeaProjects\\HealthcareApplication\\src\\com\\awesomenatchos\\inout.txt"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void mainMenuPatient(){

        //Frontend
        System.out.println("    WELCOME TO HEALTH");
        System.out.println("---------MENU--------");
        System.out.println("Options:");

        System.out.println(" 1. Write to diary");
        System.out.println(" 2. Find your Medical info");
        System.out.println(" 3. See personal data");
        System.out.println(" 4. Exit");
        System.out.println("Please enter your option: ");
    }

    public static void diaryMainMenu(ArrayList<String>diaryList){
        Scanner scan = new Scanner(System.in);
        System.out.println("----DIARY----");
        System.out.println("1. Write in diary:");
        System.out.println("2. Read diary");
        System.out.println("3. Main menu");
        System.out.println("Enter option: ");
        int userOption1 = scan.nextInt();

        switch (userOption1){
            case 1:
                System.out.println("Please write in diary:");
                String diaryEntry = scan.nextLine();
                diaryList.add(diaryEntry);
                break;
            case 2:
                System.out.println("Read diary:");
                if(diaryList.size()> 0){
                    for(int i = 0; i< diaryList.size(); i++) {
                        System.out.println(diaryList.get(i) + "\n");
                    }
                    break;
                }
                else
                {
                    System.out.println("You have no diary entry yet");
                    mainMenuPatient();
                    break;
                }
            case 3:
                mainMenuPatient();
                break;
            default:
                System.out.println("Invalid option");

    }
        public static void main(String[]args){

        Users admin = new Users(123,"Natcha", "Uthaug", "q", 1991, "Fanahammaren 24j", true );
        Boolean flag = true;
        ArrayList<String>diaryList = new ArrayList<String>();

        /*do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter UserID:");
            int userUserID = scan.nextInt();
            int adminUserID = admin.getUserID();
            System.out.println("Please enter Password: ");
            String userPassword = scan.next();
            String adminPassword = admin.getUserPassword();

            System.out.println("UserID" + admin.userID);
            System.out.println("UserPassword " + admin.userPassword);
            System.out.println(admin.getUserPassword());

            if((admin.getUserID() == userUserID) && (admin.getUserPassword() == userPassword)){
                System.out.println("cool");
            }



            if((adminUserID == userUserID) && (adminPassword == userPassword)) {

             scan = new Scanner(System.in);
                mainMenuPatient();
                int userOption = scan.nextInt();

                switch(userOption){
                    case 1:
                        diaryMainMenu(diaryList); break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("Goodbye!"); break;
                    default:
                        System.out.println("Please try a valid option from the menu");
                        mainMenuPatient();
                        break;

                }
            }
           //System.out.println("Incorrect password of UserNAme");

       // } while(flag);








*/