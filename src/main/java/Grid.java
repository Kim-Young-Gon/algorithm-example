import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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

    /**
     * 배열 출력
     */
    public void printGrid() {
        String printStr = ToStringBuilder.reflectionToString(grid, ToStringStyle.SIMPLE_STYLE);
        printStr = printStr.replaceAll("},", "\r\n")
                .replaceAll("\\{", "").replaceAll("}", "");
        System.out.println("===============");
        System.out.println(printStr);
        System.out.println("===============");
    }
}
