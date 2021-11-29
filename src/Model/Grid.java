package Model;

import java.util.Arrays;

public class Grid {

    private int[][] grid;

    public Grid() {
        grid = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
    }

    public void nextGrid() {
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[i].length ; j++) {
                checkNeighbor(j, i);
            }
        }
    }

    private void checkNeighbor(int x, int y) {
        int sum = 0;
        if (x - 1 >= 0 && y - 1 >= 0 && grid[y-1][x-1] == 1) {
            sum++;
        } else if (x >= 0 && y - 1 >= 0 && grid[y-1][x] == 1) {
            sum++;
        } else if (x + 1 < grid.length && y - 1 >= 0 && grid[y-1][x+1] == 1) {
            sum++;
        } else if (x - 1 >= 0 && y >= 0 && grid[y][x-1] == 1) {
            sum++;
        } else if (x + 1 < grid.length && y >= 0 && grid[y][x+1] == 1) {
            sum++;
        } else if (x - 1 >= 0 && y + 1 < grid.length && grid[y+1][x-1] == 1) {
            sum++;
        } else if (x >= 0 && y + 1 < grid.length && grid[y+1][x] == 1) {
            sum++;
        } else if (x + 1 < grid.length && y + 1 < grid.length && grid[y+1][x+1] == 1) {
            sum++;
        }
        if (sum == 2 || sum == 3) {
            grid[y][x] = 1;
        } else {
            grid[y][x] = 0;
        }
    }

    public void checkIndex(int x, int y) {
        if (grid[y][x] == 0) {
            System.out.println("dead");
        } else if (grid[y][x] == 1) {
            System.out.println("alive");
        }
    }

    public void startGrid(Cell[] cell) {
        for (int i = 0; i < cell.length; i++) {
            //cell[i];
        }
        //int x = cell.getX();
        //int y = cell.getY();
        //grid[y][x] = 1;
    }

    public int[][] getGrid() {
        return grid;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0 ; i < grid.length ; i++) {
            string.append(Arrays.toString(grid[i])).append("\n");
        }
        return string.toString();
    }
}
