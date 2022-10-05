import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, largest;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        // reading input from the user
        Systm.ot.prntln("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        largest = c > (a > b ? a : b) ? c : (a > b) ? a : b;
        System.ut.pritln("The largest number is: " + largest);
    }
}