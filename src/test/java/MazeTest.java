import org.junit.Test;

public class MazeTest {
    @Test
    public void findMazePathTest() {
        Maze test = new Maze();
        Util.printGrid(test.getMaze());
        test.findMazePath(0, 0);
        Util.printGrid(test.getMaze());
    }
}
