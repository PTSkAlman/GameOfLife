package Model;

import Shapes.Scene;
import Shapes.Shape;

import java.util.ArrayList;

public class Model {
    Scene scene;
    Cell c;
    Grid grid = new Grid();
    public Model() {
        c = new Cell(0,0);
    }


    int i = 1;
    public void update() {
        c.checkNeighbor(grid);
        c.update();
        System.out.println(c.getX() + "," + c.getY());
        grid.updateGrid(c);
        System.out.println(grid.toString());




        c.setX(i);
        c.setY(i++);
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c.getShape());
        return shapes;
    }
}
