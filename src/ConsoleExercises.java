import java.sql.SQLOutput;
import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The Value of ps is approximately %s.", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number!");
//        String numberInput = scanner.next();
//        System.out.println("Your number is: "+numberInput);
//
//        System.out.println("Enter some words");
//        String inputTwo = scanner.next();
//        System.out.println(inputTwo);
//
//        System.out.println("Enter your lines again");
//        String inputThree = scanner.nextLine();
//        System.out.println(inputThree);
        System.out.println("Enter your length");
        int userlength = scanner.nextInt();

        System.out.println("Enter your height");
        int userHeight = scanner.nextInt();

        System.out.println("Your Area is: "+ (userlength * userHeight));

        System.out.println("How many sides are in your classroom?");
        int userSides = scanner.nextInt();

        System.out.println("Your Perimeter is: "+ (userlength*userSides));


    }
}
