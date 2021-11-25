package Model;

import Shapes.Point;
import Shapes.Shape;

public class Cell {

    private int x,y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {

    }

    public void checkNeighbor(Grid grid) {
        int sum = 0;
        int[][] g = grid.getGrid();
        if (x - 1 >= 0 && y - 1 >= 0 && g[y-1][x-1] == 1) {
            sum++;
        } else if (x>= 0 && y - 1 >= 0 && g[y-1][x] == 1) {
            sum++;
        } else if (x + 1 >= g.length && y - 1 >= 0 && g[y-1][x+1] == 1) {
            sum++;
        } else if (x - 1 >= 0 && y >= 0 && g[y][x-1] == 1) {
            sum++;
        } else if (x + 1 >= g.length && y >= 0 && g[y][x+1] == 1) {
            sum++;
        } else if (x - 1 >= 0 && y + 1 >= g.length && g[y+1][x-1] == 1) {
            sum++;
        } else if (x >= 0 && y + 1 >= g.length && g[y+1][x] == 1) {
            sum++;
        } else if (x + 1 >= g.length && y + 1 >= g.length && g[y+1][x+1] == 1) {
            sum++;
        }
        /*if (sum > 4 || sum < 2) {
            grid.getGrid()[y][x] = 0;
        } else {
            grid.getGrid()[y][x] = 1;
        }*/
    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
