import java.util.Scanner;

public class onedimensional {
    public static void main(String[] args) {
        int total;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of the student:");
        String student = input.next();
        int[] subject1 = new int[4];
        int[] subject2 = new int[4];
        int[] subject3 = new int[4];
        int[] subject4 = new int[4];
        System.out.println("enter the marks of subjects:");
        for (int i = 0; i < 1; i++) {
            System.out.println("enter the marks of subject1:");
            subject1[i] = input.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("enter the marks of subject2:");
            subject2[i] = input.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("enter the marks of subject3:");
            subject3[i] = input.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("enter the marks of subject4:");
            subject4[i] = input.nextInt();
        }
        total = subject1[0] + subject2[0] + subject3[0] + subject4[0];
        System.err.println("total marks of student:" + total);
    }
}