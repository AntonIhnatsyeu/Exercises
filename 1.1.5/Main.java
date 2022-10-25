import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scanner.nextDouble();
        System.out.println("Enter y: ");
        y = scanner.nextDouble();
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
