import java.awt.geom.Point2D;
import java.util.ArrayList;

public class List {

    private ArrayList<Line> list;

    public List(){
        this.list = new ArrayList<>();
    }

    public void addList(Line line){
        list.add(line);
    }

    public ArrayList<Line> getList() {
        return list;
    }

    public void setList(ArrayList<Line> list) {
        this.list = list;
    }


    public void print(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public Line get(int i) {
        return list.get(i);
    }
}
