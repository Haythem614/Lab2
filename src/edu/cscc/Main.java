package edu.cscc;

import java.util.Scanner;

// Haythem Mohammad January 22, 2020 The purpose of lab 2 is to categorize the type of storm depending on the wind speed

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        long speed;
        String classification;

        System.out.print("Please enter the wind speed (mph): ");
         speed = input.nextLong();
         if (speed >= 0 && speed <= 38) {
             classification = "Not in scale";
         } else if (speed <= 73) {
             classification = "Tropical storm";
         } else if (speed <= 95) {
             classification = "Category One Hurricane";
         } else if (speed <=110) {
             classification = "Category Two Hurricane";
         } else if (speed <=129) {
             classification = "Category Three Hurricane";
         } else if (speed <=156) {
             classification = "Category Four Hurricane";
         } else {
             classification = "Category Five Hurricane";
         }

        System.out.println("Classification: "+classification);
    }
}
