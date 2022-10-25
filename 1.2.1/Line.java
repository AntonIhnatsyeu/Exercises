import java.awt.geom.Point2D;

public class Line {

    double x, y;
    Point2D.Double line;

    public Line() {
        line = new Point2D.Double(x = Math.random(), y = Math.random());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Точка x " + x
                + " Точка y " + y;
    }
}
