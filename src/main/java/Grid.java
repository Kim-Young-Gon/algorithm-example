public class Grid {
    private int N = 8;
    private int[][] grid = {
            {1, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 1, 1}
    };

    private final int BACKGROUND_COLOR = 0;// white
    private final int IMAGE_COLOR = 1;// blue
    private final int ALREADY_COUNTED = 2;// red

    public int countCells(final int x, final int y) {
        if (x < 0 || y < 0 || x >= N || y >= N)
            return 0;
        else if (grid[x][y] != IMAGE_COLOR)
            return 0;
        else {
            grid[x][y] = ALREADY_COUNTED;
            return 1 + countCells(x - 1, y + 1) + countCells(x, y + 1)
                    + countCells(x + 1, y + 1) + countCells(x - 1, y)
                    + countCells(x + 1, y) + countCells(x - 1, y - 1)
                    + countCells(x, y - 1) + countCells(x + 1, y - 1);
        }
    }

    public int[][] getGrid() {
        return this.grid;
    }
}
