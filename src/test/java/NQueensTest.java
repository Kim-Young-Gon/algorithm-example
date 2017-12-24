import org.junit.Test;

public class NQueensTest {
    @Test
    public void queensTest() {
        NQueens nQueens = new NQueens();
        nQueens.queens(0);
        Util.printGrid(nQueens.getGrid());
    }
}
