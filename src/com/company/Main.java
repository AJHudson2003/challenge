package com.company;
import javax.swing.*;
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
        System.out.println(" welcome to my quiz I really hope that you wil like it and injoy the quiz that i have provided Bye! ");

        System.out.println("Enter your first name:");
        String f = sc.nextLine();
        System.out.println("Enter your last name:");
        String l = sc.nextLine();
        System.out.println("Your name is: " + f + " " + l);
        //gender code
        System.out.println(" enter you gender here: ");
        String gender = sc.nextLine();
        System.out.println("gender: "+ gender);

        //game/console type code
        System.out.println("Enter your console that you play");
        String console = sc.nextLine();
        switch (console){
            case "xbox":
                System.out.println("Same dude we can play together" + console);
                break;
            case "PS4":
                System.out.println("Oh thats sad we cant play together " + console);
                break;
            case "PC":
                System.out.println("Oh cool i will get one soon maybe we can play later" + console);
                break;
            case "Switch":
                System.out.println("oh thats really cool i wish i could have that but oh well." + console);
                break;
            case "no console":
                System.out.println("oh that suck you should buy one, in my opinion buy a xbox or a pc but its your chose " + console);
                break;
        }
        // game code
        System.out.println(" enter your favorite game here: ");
        String video = sc.nextLine();
        System.out.println("video: " + video);

       //password code

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

        Scanner input = new Scanner(System.in);

        System.out.println("there are two options to this password question and that is password or 1234 ");
        System.out.println("Enter password: ");
        String userinput = input.nextLine();
        if (userinput.equals ("password")) {
            System.out.println("Correct!");
        }
        else if (userinput.equals ("1234")) {
            System.out.println("Wrong!");
        }



        //grades/exam code
        System.out.println("enter your percentage grades and after you are done type end and it will end the line of code");
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



        System.out.println("Enter your exam score:");

        marksObtained = input.nextInt();


        if (marksObtained >= passingMarks) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("Unfortunately, you failed to pass the exam.");
        }



        //are you able to vote
        System.out.println("Enter your age");
        Scanner s1=new Scanner(System.in);
        int age=s1.nextInt();
        if ( age >= 18 ){
            System.out.println( "Your age is 18+." );
            System.out.println( "Eligible to vote" );
        }

        else {
            System.out.println("You are not yet 18.");
            System.out.println("not eligible to vote");
        }

    }
    }

