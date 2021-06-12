import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int total;
        Scanner input = new Scanner(System.in);
        System.out.println("*****Restaurant*****");
        System.out.println("Do you wish to order food.");
        String number = input.next();
        // string ch = number.charAt(0);
        if (number.equals("y") || number.equals("Y")) {
            System.out.println("Menu Display");
            System.out.println("1.Snack");
            System.out.println("2.Lunch");
            System.out.println("3.Dinner");
            System.out.println("4.Soft Drinks/Tea Coffee");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println(
                            "S.No \t Snacks Item \t Quantity \t Price \n 1. \t Idli \t\t 1 \t\t 40 \n 2. \t Dosa \t\t 1 \t\t 50 \n 3. \t Poha \t\t 1 \t\t 40 \n 4. \t Uttapam \t 1 \t\t 30 \n 5. \t Coffee \t 1 \t\t 20 \n");
                    System.out.print("Enter the Snack item you want to take:");
                    int choice = input.nextInt();
                    System.out.println("enter the quantity of item:");
                    int quantity = input.nextInt();
                    if (choice == 1) {
                        total = quantity * 40;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice == 2) {
                        total = quantity * 50;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice == 3) {
                        total = quantity * 40;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice == 4) {
                        total = quantity * 30;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice == 5) {
                        total = quantity * 20;
                        System.out.println("Your Total bill=" + total);
                    }
                    System.out.println("Thank You and Have a nice day. ");
                    break;
                case 2:
                    System.out.println(
                            "S.No \t Lunch Item \t Quantity \t Price \n 1. \t Daal Makhani \t 1 \t\t 60 \n 2. \t Roti \t\t 1 \t\t 10 \n 3. \t Rice \t\t 1 \t\t 40 \n 4. \t Curd \t\t 1 \t\t 30 \n");
                    System.out.print("Enter the item you want to take:");
                    int choice1 = input.nextInt();
                    System.out.println("enter the quantity of item:");
                    int quantity1 = input.nextInt();
                    if (choice1 == 1) {
                        total = quantity1 * 60;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice1 == 2) {
                        total = quantity1 * 10;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice1 == 3) {
                        total = quantity1 * 40;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice1 == 4) {
                        total = quantity1 * 30;
                        System.out.println("Your Total bill=" + total);
                    }
                    System.out.println("Thank You and Have a nice day. ");
                    break;
                case 3:
                    System.out.println(
                            "S.No \t Dinner Item \t Quantity \t Price \n 1. \t Daal Makhani \t 1 \t\t 60 \n 2. \t Roti \t\t 1 \t\t 10 \n 3. \t Rice \t\t 1 \t\t 40 \n 4. \t Curd \t\t 1 \t\t 30 \n");
                    System.out.print("Enter the item you want to take:");
                    int choice2 = input.nextInt();
                    System.out.println("enter the quantity of item:");
                    int quantity2 = input.nextInt();
                    if (choice2 == 1) {
                        total = quantity2 * 40;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice2 == 2) {
                        total = quantity2 * 10;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice2 == 3) {
                        total = quantity2 * 40;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice2 == 4) {
                        total = quantity2 * 30;
                        System.out.println("Your Total bill=" + total);
                    }
                    System.out.println("Thank You and Have a nice day. ");
                    break;
                case 4:
                    System.out.println(
                            "S.No \t Soft Drinks Item \t Quantity \t Price \n 1. \t Cock \t\t\t 1 \t\t 40 \n 2. \t Pepsi \t\t\t 1 \t\t 40 \n 3. \t Due \t\t\t 1 \t\t 40 \n 4. \t Limca \t\t\t 1 \t\t 40 \n");
                    System.out.print("Enter the item you want to take:");
                    int choice3 = input.nextInt();
                    System.out.println("enter the quantity of item:");
                    int quantity3 = input.nextInt();
                    if (choice3 == 1) {
                        total = quantity3 * 40;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice3 == 2) {
                        total = quantity3 * 40;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice3 == 3) {
                        total = quantity3 * 40;
                        System.out.println("Your Total bill=" + total);
                    } else if (choice3 == 4) {
                        total = quantity3 * 40;
                        System.out.println("Your Total bill=" + total);

                    }
                    System.out.println("Thank You and Have a nice day. ");
                    break;
                default: {
                    System.out.println("Invalid input");
                }
            }
        } else {
            System.out.println("No Problem! Thank You.");
        }
    }
}
