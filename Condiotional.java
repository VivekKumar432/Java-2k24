import java.util.Scanner;

public class Condiotional {
    public static void main(String[] args) {
        Scanner samsung = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = samsung.nextInt();
        // > this means greater than
        // < this means less than
        if (age >= 18) {
            System.out.println("You can vote");
        } else if (age < 18) {
            System.out.println("You cannot vote");
        }
        samsung.close();
    }
}
