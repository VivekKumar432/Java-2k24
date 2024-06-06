import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner samsung = new Scanner(System.in);
        System.out.println("Enter your name"); // String Value
        String name = samsung.nextLine();
        System.out.println("Please enter your phone number"); // int Value
        int phoneNumber = samsung.nextInt();
        System.out.println("Are you 50 years old?"); // Boolean Value
        boolean isFifty = samsung.nextBoolean();

        System.out.println("This is the data entered by you");
        System.out.println("This is your name :" + name);
        System.out.println("This is your phone number :" + phoneNumber);
        System.out.println("Are you 50 years old? :" + isFifty);

        samsung.close();
    }
}
