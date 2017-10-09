import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Maze {
    private int N = 8;
    private int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}
    };

    private final int PATHWAY_COLOR = 0;// white
    private final int WALL_COLOR = 1;// blue
    private final int BLOCKED_COLOR = 2;// red
    private final int PATH_COLOR = 3;// green

    /**
     * 미로 찾기
     * @param x
     * @param y
     * @return
     */
    public boolean findMazePath(final int x, final int y) {
        if (x < 0 || y < 0 || x >= N || y >= N)
            return false;
        else if (maze[x][y] != PATHWAY_COLOR)
            return false;
        else if (x == N - 1 && y == N - 1) {
            maze[x][y] = PATH_COLOR;
            return true;
        } else {
            maze[x][y] = PATH_COLOR;
            if (findMazePath(x - 1, y) || findMazePath(x, y + 1)
                    || findMazePath(x + 1, y) || findMazePath(x, y - 1))
                return true;
            maze[x][y] = BLOCKED_COLOR;
            return false;
        }
    }

    public void printMaze() {
        String printStr = ToStringBuilder.reflectionToString(maze, ToStringStyle.SIMPLE_STYLE);
        printStr = printStr.replaceAll("},", "\r\n")
                .replaceAll("\\{", "").replaceAll("}", "");
        System.out.println("===============");
        System.out.println(printStr);
        System.out.println("===============");
    }
}
