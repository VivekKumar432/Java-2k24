import java.util.Scanner;

public class Input {

    //int-> nextInt
    //String value -> next or nextLine
    public static void main(String[] args) {
        Scanner samsung = new Scanner(System.in);
        System.out.println("Please enter your marks"); // int Value
        int marks = samsung.nextInt(); //50
        System.out.println("This is your marks :" + marks);
        samsung.nextLine();
        System.out.println("Enter your name"); // String Value
        String name = samsung.nextLine();
        System.out.println("This is your name :" + name);

        // Scanner samsung = new Scanner(System.in);

        // System.out.println("Enter your name"); // String Value
        // String name = samsung.nextLine();
        // System.out.println("This is your name :" + name);
        // System.out.println("Enter your name"); // String Value
        // String name2 = samsung.next();
        // System.out.println("This is your name :" + name2);
        samsung.close();


        // next- it takes input till space(white space)
        // nextLine- it takes input till next line (new line)
    }
}
