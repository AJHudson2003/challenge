package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declares the object and initialize with
        //predefined standard input object
        /*
       in this quiz you will have several questions that you have answer
        I really aprricate you taking th time to do this quiz
        Also I am glad that you have answered all these questions
        This is just some coed and i hope it helps with the quize
        Also this all the code down below that is working
        i have added new code every day
        and i really would like you to try it.
        thank you and have fun
        */
        Scanner sc = new Scanner(System.in);
        //name code
        System.out.println("enter your name: ");
        String name = sc.nextLine();
        System.out.println("name: "+ name);
        // gender code
        System.out.println(" enter you gender here: ");
        String gender = sc.nextLine();
        System.out.println("gender: "+ gender);

        //game/console type code
        System.out.println("enter your console: ");
        String console = sc.nextLine();
        System.out.println("console name: " + console);
        // game code
        System.out.println(" enter your favorite game here: ");
        String video = sc.nextLine();
        System.out.println("video: " + video);

        //pet name code
        System.out.println("what kind of pet do you have:");
        String typeofpet = sc.nextLine();
        System.out.println("pet type: " +typeofpet);
        System.out.println("enter your pet name:");
        String pet = sc.nextLine();
        System.out.println("pet name: " + pet);
        
        //music type code
        System.out.println("do you like music");
        String answer = sc.nextLine();
        System.out.println("your answer:" + answer);
        System.out.println("what type of music?");
        String type = sc.nextLine();
        System.out.println("Your type of music:" + type);

        //school question
        System.out.println("Do you like school?");
        String school = sc.nextLine();
        System.out.println("Answer:" + school);
        System.out.println("What is your favorite subject");
        String subject = sc.nextLine();
        System.out.println("answer:" + subject);

        //grades/exam code
        System.out.println("enter you grades and after you do type end and enter to end the line of code");
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

        System.out.println("Enter your exam score:");

        marksObtained = input.nextInt();

        if (marksObtained >= passingMarks) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("Unfortunately, you failed to pass the exam.");
        }


    }
}
