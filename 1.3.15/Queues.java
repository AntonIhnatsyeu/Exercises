import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {
    Scanner scanner = new Scanner(System.in);
    String print;

    public String print(int k, int size) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("Введите строки");
        for (int i = 0; i < size; i++) {
            queue.add(scanner.nextLine());
        }
        Iterator<String> pl = queue.iterator();
        for (int i = 0; i <= size - k; i++) {
            print = pl.next();
        }
        return print;
    }
}
