import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int First = input.nextInt();
        System.out.println("Enter Second number: ");
        int Second = input.nextInt();
        System.out.println("Enter Third number: ");
        int Third = input.nextInt();
        if (First > Second) {
            if (First > Third) {
                System.out.println("First is the largest number:" + First);
            } else {
                System.out.println("Third is the largest number:" + Third);
            }
        } else if (Second > Third) {
            System.out.println("Second is the largest number:" + Second);
        } else {
            System.out.println("Third is the largest number:" + Third);
        }
    }
}
