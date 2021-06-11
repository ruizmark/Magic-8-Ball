import java.util.Random;

// Created by Mark R
// Program is base off the fortune-telling or seeking advice, developed in the 1950s!
// We will be using the random class for the fortunes

public class Magic8 {
    public static void main(String[] args) {

        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 20
        // We will have 20 responses from the ball
        int rand_int1 = rand.nextInt(20);

        if ( rand_int1 == 1){
            System.out.println("It is certain.");
        } else if (rand_int1 == 2){
            System.out.println("It is decidedly so.");
        } else if (rand_int1 == 3){
            System.out.println("Without a doubt.");
        } else if (rand_int1 == 4){
            System.out.println("Yes – definitely.");
        } else if (rand_int1 == 5){
            System.out.println("You may rely on it.");
        } else if (rand_int1 == 6){
            System.out.println("As I see it, yes.");
        } else if (rand_int1 == 7){
            System.out.println("Most likely.");
        } else if (rand_int1 == 8){
            System.out.println("Outlook good.");
        } else if (rand_int1 == 9) {
            System.out.println("Yes.");
        } else if (rand_int1 == 10) {
            System.out.println("Signs point to yes.");
        } else if (rand_int1 == 11){
            System.out.println("Reply hazy, try again.");
        } else if (rand_int1 == 12){
            System.out.println("Ask again later.");
        } else if (rand_int1 == 13){
            System.out.println("Better not tell you now.");
        } else if (rand_int1 == 14){
            System.out.println("Cannot predict now.");
        } else if (rand_int1 == 15){
            System.out.println("Concentrate and ask again.");
        } else if (rand_int1 == 16){
            System.out.println("Don't count on it.");
        } else if (rand_int1 == 17){
            System.out.println("My reply is no.");
        } else if (rand_int1 == 18){
            System.out.println("My sources say no.");
        } else if (rand_int1 == 19) {
            System.out.println("Outlook not so good.");
        } else if (rand_int1 == 20) {
            System.out.println("Very doubtful.");
        }

    }
}

