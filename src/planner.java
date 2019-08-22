import java.util.Scanner;
public class planner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        intro(input);

    }

    public static void intro(Scanner input){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like a great trip");
        budget(input);
    }

    public static void budget(Scanner input){
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

    }

    public static void time(Scanner input){

    }

    public static void distance(Scanner input){

    }
}
