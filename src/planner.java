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
    }
}
