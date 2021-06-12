import java.util.Scanner;

public class tableno {
    public static void main(String[] args) {
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no:");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            sum = i * number;
            System.out.println(number + " * " + i + " = " + sum);
        }
    }
}
