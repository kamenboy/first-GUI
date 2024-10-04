import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("You entered: " + num);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}