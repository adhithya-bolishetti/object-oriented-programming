package com.stchool.java.oop.strings;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "adhithya".trim();
        String password = "adhithya1234";
        String email = "adhithya.bolishetti@gmail.com".trim();
        email = email.toLowerCase();

        /*charAt, compareTo, equals, compareToIgnoreCase, concat, lowerCase, upperCase, converting string to array
        * trim, split*/

        System.out.println(username.charAt(0));
        System.out.println(username.compareTo("Adhithya"));
        System.out.println(username.compareToIgnoreCase("Adhithya"));

        if(username.equals("adhithya ".trim()) && email.equals("Adhithya.bolishetti@gmail.com".toLowerCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(username.toUpperCase());
        char[] charArray = username.toCharArray();
        for(char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        String data = "111,Adhithya,adhithya.bolishetti@gmail.com";
        String[] details = data.split(",");
        for(String s : details) {
            System.out.println(s + " ");
        }
        details[1] = details[1].replace('A','a');

//        System.out.println("1. SignUp");
//        System.out.println("2. LogIn");
//        System.out.println("Enter your choice : ");
//
//        int choice = scanner.nextInt();
//        String username = null, email = null, password = null;
//        String customerUserName, customerEmail, customerpassword;
//
//        char toContinue = 'Y';
//        while(toContinue == 'Y') {
//            switch (choice) {
//                case 1 :
//                    System.out.println("Enter UserName");
//                    username = scanner.next().trim();
//
//                    System.out.println("Enter E-Mail");
//                    email = scanner.next().trim().toLowerCase();
//
//                    System.out.println("Enter Password");
//                    password = scanner.next();
//                    if(password.length() < 6) {
//                        System.out.println("password length must be greater than 6 \n Re-enter password");
//                        password = scanner.next();
//                    }
//                    break;
//                case 2:
//                    if(username == null || email == null || password == null) {
//                        System.out.println("User not exist");
//                        break;
//                    }
//                    System.out.println("Enter your UserName");
//                    customerUserName = scanner.next().trim();
//
//                    System.out.println("Enter your E-Mail");
//                    customerEmail = scanner.next().trim().toLowerCase();
//
//                    System.out.println("Enter your password");
//                    customerpassword = scanner.next();
//
//                    if(username.equals(customerUserName)
//                            && email.equals(customerEmail)
//                            && password.equals(customerpassword)) {
//                        System.out.println("Login Successful");
//                    } else {
//                        System.out.println("Login failed");
//                    }
//                    break;
//                default:
//                    System.out.println("Enter valid input");
//            }
//            System.out.println("Do you want to continue : (Y/N)");
//            toContinue = scanner.next().charAt(0);
//            if(toContinue == 'N'){
//                toContinue = 'N';
//            } else {
//                choice = scanner.nextInt();
//            }
//        }
//    scanner.close();
    }
}
