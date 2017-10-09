import org.junit.Test;

public class GridTest {
    @Test
    public void countCellsTest() {
        Grid test = new Grid();
        test.printGrid();
        int x = 5, y = 1;
        int result = test.countCells(x, y);
        System.out.println(String.format("countCells(%d, %d) : %d", x, y, result));
        test.printGrid();
    }
}
