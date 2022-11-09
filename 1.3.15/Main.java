import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k;
        int size;
        System.out.println("Номер строки");
        k = scanner.nextInt();
        System.out.println("Размер очереди");
        size = scanner.nextInt();
        Queues queues = new Queues();
        System.out.println(queues.print(k, size));
    }
}
