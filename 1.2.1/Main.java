import java.awt.geom.Point2D;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int N;
        double min = 1;
        double rast;

        List list = new List();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество точек: ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            Line line = new Line();
            list.addList(line);
        }
        list.print();

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                rast = Point2D.distance(list.get(i).getX(), list.get(i).getY(), list.get(j).getX(), list.get(j).getY());
                System.out.println(rast);
                if (rast < min) {
                    min = rast;
                }
            }
        }
        System.out.println("Минимальное расстояние = " + min);
    }
}