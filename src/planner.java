import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class planner {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);

        Scanner input = new Scanner(System.in);
        intro(input, df);

    }

    public static void intro(Scanner input, DecimalFormat df){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like a great trip");
        budget(input, df);
    }

    public static void budget(Scanner input, DecimalFormat df){
        System.out.println("*****************");
        System.out.println("");
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double conversion = input.nextDouble();

        System.out.println("If you are travelling for" + days + " days, that is the same as " + (days * 24) + " hours or " + (days * 24 * 60) + " minutes");
        System.out.println("If you are going to spend $" + money + " USD, that means you can spend up to " + df.format((money / days)) + " per day");

    }

    public static void time(Scanner input, DecimalFormat df){

    }

    public static void distance(Scanner input, DecimalFormat df){

    }
}
