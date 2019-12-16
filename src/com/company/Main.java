package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declares the object and initialize with
        //predefined standard input object
        /*
       in this quiz you will have several questions that you have answer
        I really appreciate you taking th time to do this quiz
        Also I am glad that you have answered all these questions
        This is just some coed and i hope it helps with the quiz
        Also this all the code down below that is working
        i have added new code every day
        and i really would like you to try it.
        thank you and have fun
        */
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        //name code

        System.out.println(" welcome to my quiz I really hope that you wil like it and injoy the quiz that i have provided Bye! ");

        System.out.println("Enter your first name:");
        String f = sc.nextLine();
        System.out.println("Enter your last name:");
        String l = sc.nextLine();
        System.out.println("Your name is: " + f + " " + l);
        //gender code

        System.out.println("\n----------------------\n");

        System.out.println(" enter you gender here: ");
        String gender = sc.nextLine();
        System.out.println("gender: "+ gender);

        System.out.println("\n----------------------\n");

        //game/console type code
        System.out.println("Enter your console that you play");
        String console = sc.nextLine();
        switch (console){
            case "xbox":
                System.out.println("Same dude we can play together");
                break;
            case "ps4":
                System.out.println("Oh that's sad we cant play together " );
                break;
            case "pc":
                System.out.println("Oh cool i will get one soon maybe we can play later" );
                break;
            case "switch":
                System.out.println("oh that's really cool i wish i could have that but oh well." );
                break;
            case "no console":
                System.out.println("oh that suck you should buy one, in my opinion buy a xbox or a pc but its your chose " );
                break;
        }
        // game code
        System.out.println(" enter your favorite game here: ");
        String video = sc.nextLine();
        System.out.println("video: " + video);

       //password code
        System.out.println("\n----------------------\n");
        //music type code
        System.out.println("do you like music");
        String answer = sc.nextLine();
        System.out.println("your answer:" + answer);
        System.out.println("what type of music?");
        String type = sc.nextLine();
        System.out.println("Your type of music:" + type);

        System.out.println("\n----------------------\n");

        System.out.println("answer the question do you like school:");
       System.out.println("do you like school?");
       String school = sc.nextLine();
        String subject = sc.nextLine();
       if(school.equals("yes")){
           System.out.println("answer:" + school);
           System.out.println("what is your favorite subject?");
           System.out.println("answer:" + subject);
       }else {
           System.out.println("ok, that's your chose!");
        }

        System.out.println("\n----------------------\n");

        System.out.println("Did you like my quiz so far");
        System.out.println("Enter your answer: ");
        String question = input.nextLine();
        if (question.equals ("yes")) {
            System.out.println("thanks for using my quiz!" + question);
        }
        else {
            System.out.println("oh i wish you did, thx for taking it though!");
        }

        System.out.println("\n----------------------\n");

        System.out.println("do you like to drive?");
        System.out.println("your answer:");
        String drive = sc.nextLine();
        String car = sc.nextLine();
        if (drive.equals("yes")) {
            System.out.println("that's cool, glade you do ");
            System.out.println("what kind of car do you have?");
            System.out.println("answer:" + car);
        }
        else {
            System.out.println("oh i do you should try it");
        }




        System.out.println("\n----------------------\n");


        System.out.println("Enter a password if you dare ");
        System.out.println("Enter a password: ");
        String userinput = input.nextLine();
        if (userinput.equals ("password")) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wrong!");
        }


        System.out.println("\n----------------------\n");
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

        System.out.println("\n----------------------\n");

        System.out.println("thx for taking the quiz see you next time!");



    }
    }