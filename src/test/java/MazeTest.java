import org.junit.Test;

public class MazeTest {
    @Test
    public void findMazePathTest() {
        Maze test = new Maze();
        test.printMaze();
        test.findMazePath(0, 0);
        test.printMaze();
    }
}
