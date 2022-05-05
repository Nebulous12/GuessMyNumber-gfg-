
package com.company;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int points = 20;

        double num = Math.floor(Math.random() * 21) + 1;
        System.out.println("Guess a number between 0 and 20");
           while (points > 0) {

               int guess = in.nextInt();

               if (guess <= 0 || guess > 20) {
                   System.out.println("Invalid number!, enter valid number");
               } else if (guess > num) {
                   points = points - 1;
                   System.out.println("Your guess is high");
               } else if (guess < num) {
                   points = points - 1;
                   System.out.println("Your guess is low ");
               } else if (guess == num) {
                   System.out.println("You Won!");
                   System.out.print("Your points are:");
                   System.out.println(points);
                   break;
               } else {
                   System.out.println("You Lost!");
               }
           }
    }
}
