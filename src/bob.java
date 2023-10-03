import java.util.Scanner;
public class bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask bob something!");
        String userQ = scanner.nextLine();
        if (userQ.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userQ.endsWith("!")) {
            System.out.println("Whoa! Chill out!");
        } else if (userQ.isEmpty()){
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
