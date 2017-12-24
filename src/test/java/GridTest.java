import org.junit.Test;

public class GridTest {
    @Test
    public void countCellsTest() {
        Grid test = new Grid();
        Util.printGrid(test.getGrid());
        int x = 5, y = 1;
        int result = test.countCells(x, y);
        System.out.println(String.format("countCells(%d, %d) : %d", x, y, result));
        Util.printGrid(test.getGrid());
    }
}
