package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declares the object and initialize with
        //predefined standard input object
        Scanner sc = new Scanner(System.in);
        //name code
        String name = sc.nextLine();
        System.out.println("enter your name: ");
        System.out.println("name: "+ name);
        // gender code
        String gender = sc.nextLine();
        System.out.println(" enter you gender here: ");
        System.out.println("gender: "+ gender);

        System.out.println("enter you grades and after you do type end and enter to emd the line of code");

        System.out.println("enter your name: ");
        String name = sc.nextLine();
        System.out.println("name: " + name);
        // gender code
        System.out.println(" enter you gender here: ");
        String gender = sc.nextLine();
        System.out.println("gender: " + gender);


        int sum = 0, count = 0;


        while (sc.hasNextInt()) {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int grade = sum / count;
        System.out.println("average: " + grade);

        int marksObtained, passingMarks;

        passingMarks = 60;

        Scanner input = new Scanner(System.in);

        System.out.println("Input marks scored by you:");

        marksObtained = input.nextInt();

        if (marksObtained >= passingMarks) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("Unfortunately, you failed to pass the exam.");

        }
    }
}