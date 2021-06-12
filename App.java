import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("you are eligeble for vote.");
        } else {
            System.out.println("you are not elegibel for vote.");
        }

    }
}