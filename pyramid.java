import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number for pyramid:");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int k = number; k > number - i; k--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
