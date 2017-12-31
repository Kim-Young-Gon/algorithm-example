public class NQueens {
    private int N;
    private int[] cols;
    private int[][] grid;

    public NQueens() {
        this.N = 8;
        cols = new int[N];
        grid = new int[N][N];
    }

    public NQueens(final int N) {
        this.N = N;
        cols = new int[this.N];
        grid = new int[this.N][this.N];
    }

    /**
     * n queens problem
     * @param level
     * @return
     */
    public boolean queens(final int level) {
        if (!promising(level)) {
            return false;
        } else if (level == N - 1) {
            for (int i = 0; i < N; i++) {
                grid[i][cols[i]] = 1;
            }
            return true;
        }
        for (int i = 0; i < N; i++) {
            cols[level + 1] = i;
            if (queens(level + 1)) {
                return true;
            }
        }
        return false;
    }

    private boolean promising(final int level) {
        for (int i = 0; i < level; i++) {
            if (cols[i] == cols[level]) {// 같은 열에 있는지 확인
                return false;
            } else if (level - i == Math.abs(cols[level] - cols[i])) {// 대각선에 있는지 확인
                return false;
            }
        }
        return true;
    }

    public int[][] getGrid() {
        return this.grid;
    }
}
