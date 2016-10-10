package com.bleh;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random rng = new Random();
    private static String getInput(String context) {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();}


    public static void main(String[]args) {
        System.out.println("Well hello there! \n I am the mystical magical 8 ball!");
        yORn();

    }
    public static void yORn(){
        System.out.println("Do you have a question ready for me? \n Please just keep your question in mind \n Then type 'Y' if you are ready or \n 'N' if you would rather not know the answers that lay before you.");
        String yesOrNo = getInput(":");
        String playerYorN = yesOrNo.toLowerCase();
        if (playerYorN.equals("y")) {
            shakeTheBall();
        } else if (playerYorN.equals("n")) {
            goodBye();
        } else {
            System.out.println("I'm sorry I do not understand..please try again");
            yORn();
        }

    }


    public static void shakeTheBall() {
        System.out.println("What is your question?");
        String question = getInput(":");
        if (question.equals("quit")) {
            goodBye();
        } else {
            getRandomNumber();
        }


    }

    public static void getRandomNumber() {
        int choice = rng.nextInt(8) + 0;
        switch (choice) {
            case 0:
                System.out.println("Concentrate and ask again");
                break;
            case 1:
                System.out.println("It is certain");
                break;
            case 2:
                System.out.println("As I see it, yes");
                break;
            case 3:
                System.out.println("Reply hazy try again");
                break;
            case 4:
                System.out.println("Ask again later");
                break;
            case 5:
                System.out.println("Don't count on it");
                break;
            case 6:
                System.out.println("My sources say no");
                break;
            case 7:
                System.out.println("Without a doubt");
                break;
            case 8:
                System.out.println("Very doubtful");
                break;
        }
        shakeAgain();
    }

    public static void shakeAgain() {
        System.out.println("Do you have another question for me? Y/N");
        String again = getInput(":");
        String againYN = again.toLowerCase();
        if (againYN.equals("y")) {
            shakeTheBall();
        } else if (againYN.equals("n")) {
            goodBye();
        } else if (againYN.equals("quit")) {
            goodBye();
        } else {
            System.out.println("I'm sorry that was not a valid resopnse");
            shakeAgain();
        }

    }


    public static void goodBye() {
        System.out.println("Goodbye");


    }


}


