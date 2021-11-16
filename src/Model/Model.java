package Model;

import Shapes.Scene;
import Shapes.Shape;

import java.util.ArrayList;

public class Model {
    Scene scene;
    Cell c;
    Grid grid = new Grid();
    public Model() {
        c = new Cell(2,2);
    }


    int i = 2;
    public void update() {
        c.checkNeighbor(grid);
        System.out.println(c.getX() + "," + c.getY());
        c.update();

        grid.updateGrid(c);
        grid.checkIndex(c.getX(), c.getY());
        grid.checkIndex(1,1);

        c.setX(i);
        c.setY(i++);
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c.getShape());
        return shapes;
    }
}
