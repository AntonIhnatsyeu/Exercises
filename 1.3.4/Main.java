import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S;
        S = scanner.nextLine();
        Parentheses parentheses = new Parentheses();
        System.out.println(parentheses.correctly(S));
    }
}
