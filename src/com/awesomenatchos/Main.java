package com.awesomenatchos;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// LOG IN PAGE
public class Main {
    public static void main(String[] args) {
        String password = "m";
        String userID = "n";
        Scanner scan = new Scanner(System.in);
        Users admin1 = new Users(1, 11, "a", "Natcha", "Uthaug", 1991, "Fanahammaren 24j", true, null);
        ArrayList<Users>testList = new ArrayList<>();
        testList.add(admin1);

        System.out.println(admin1);

        for(int a = 0; a < testList.size(); a++){
            System.out.println(testList.get(a));
        }
        System.out.println();

        boolean login = true;
        do{
            System.out.print("Enter userID: ");
            String inputUserID = scan.next();
            System.out.print("Password: ");
            String inputUserPassword = scan.next();


            if((userID.equals(inputUserID)) && (password.equals(inputUserPassword))){
                System.out.println("log-in successfully!");


            }
            else
            {
                System.out.println("Invalid userID or password!");
            }

        } while(login);
    }
}







