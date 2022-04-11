package com.awesomenatchos;

import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.Scanner;

public class Diary {
    public static int mainMenuPatient() {
        Scanner scan = new Scanner(System.in);

        System.out.println("    WELCOME TO HEALTH");
        System.out.println("---------MENU--------");
        System.out.println("Options:");
        System.out.println(" 1. Write to diary");
        System.out.println(" 2. See personal data");
        System.out.println(" 3. See medical info");
        System.out.println(" 4. Exit");
        System.out.println("Please enter your option: ");
        int userOption = scan.nextInt();
        return userOption;
    }
    public static void diaryMainMenu(Users userName) throws IOException {


        Scanner scan = new Scanner(System.in);
        System.out.println("----- DIARY-----");
        System.out.println("Name " + userName.firstName + " " + userName.getLastName());
        System.out.println("\n1. Write in diary: ");
        System.out.println("2. Read Diary");
        System.out.println("3. Main menu");
        System.out.println("4. Exit");
        boolean diary = true;
        do{
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
                    saveToFile(file.getPath(),diaryEntry, true);
                    mainMenuPatient();
                    break;
                case 2:
                    System.out.println("---Reading Diary----");
                    File file2 = new File("C:\\Users\\Natcha\\IdeaProjects\\bankingApplication\\src\\com\\awesomenatchos\\Diary.txt");
                    Scanner scan1 = new Scanner(file2);
                    while(scan1.hasNextLine()){
                        System.out.println(scan1.nextLine());
                    }
                    mainMenuPatient();
                    break;
                case 3:
                    mainMenuPatient();
                    break;
                case 4:
                    diary = false;
            }

        } while (diary);

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
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        diaryMainMenu(new Users(1, 2, "n", "Natcha", "Uthaug", 1990, "Fanahammaren 24j", true, BloodType.A ));

    }
}
