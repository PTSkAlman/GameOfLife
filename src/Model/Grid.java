package Model;

import java.util.Arrays;

public class Grid {

    private int[][] grid;
    private int[][] nextGrid;
    private int sum = 0;

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
        nextGrid = grid;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[i].length ; j++) {
                checkNeighbor(j, i);
            }
        }
        grid = nextGrid;
    }

    private void checkNeighbor(int x, int y) {
        // UL
        if (x - 1 >= 0 && y - 1 >= 0 && grid[y-1][x-1] == 1) {
            sum++;
        // UM
        } else if (x >= 0 && y - 1 >= 0 && grid[y-1][x] == 1) {
            sum++;
        // UR
        } else if (x + 1 < grid.length && y - 1 >= 0 && grid[y-1][x+1] == 1) {
            sum++;
        // ML
        } else if (x - 1 >= 0 && y >= 0 && grid[y][x-1] == 1) {
            sum++;
        // MR
        } else if (x + 1 < grid.length && y >= 0 && grid[y][x+1] == 1) {
            sum++;
        // DL
        } else if (x - 1 >= 0 && y + 1 < grid.length && grid[y+1][x-1] == 1) {
            sum++;
        // DM
        } else if (x >= 0 && y + 1 < grid.length && grid[y+1][x] == 1) {
            sum++;
        // DR
        } else if (x + 1 < grid.length && y + 1 < grid.length && grid[y+1][x+1] == 1) {
            sum++;
        }
        if (sum == 2 || sum == 3) {
            nextGrid[y][x] = 1;
        } else {
            nextGrid[y][x] = 0;
        }
    }

    public void checkIndex(int x, int y) {
        if (nextGrid[y][x] == 0) {
            System.out.println("dead");
        } else if (grid[y][x] == 1) {
            System.out.println("alive");
        }
    }

    public void startGrid(Cell[] cell) {
        for (int i = 0; i < cell.length; i++) {
            cell[i] = new Cell(i,i);
            grid[cell[i].getX()][cell[i].getY()] = 1;
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
