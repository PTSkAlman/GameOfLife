package Model;

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

    public void checkIndex(int x, int y) {
        if (grid[y][x] == 0) {
            System.out.println("dead");
        } else if (grid[y][x] >= 1) {
            System.out.println("alive");
        }
    }

    public void updateGrid(Cell cell) {
        int x = cell.getX();
        int y = cell.getY();
        grid[y][x] = 1;
    }

    public int[][] getGrid() {
        return grid;
    }
}
