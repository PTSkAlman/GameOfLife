package Model;

import Shapes.Scene;
import Shapes.Shape;

import java.util.ArrayList;

public class Model {
    Scene scene;
    Cell[] cells;
    Grid grid = new Grid();
    public Model() {
        cells = new Cell[3];
        grid.startGrid(cells);
    }

    int i = 0;
    public void update() {
        System.out.println("Generation: " + i++);
        //c.update();
        System.out.println(grid.toString());
        grid.nextGrid();
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        //shapes.add(c.getShape());
        return shapes;
    }
}
