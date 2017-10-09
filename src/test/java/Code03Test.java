import org.junit.Before;
import org.junit.Test;

public class Code03Test {
    private Code03 test;
    private int result;
    private double resultDouble;

    @Before
    public void init() {
        test = new Code03();
    }

    @Test
    public void funcTest() {
        int n = 4;
        result = test.func(n);
        System.out.println(String.format("func(%d) : %d", n, result));
    }

    @Test
    public void factorialTest() {
        int n = 4;
        result = test.factorial(n);
        System.out.println(String.format("factorial(%d) : %d", n, result));
    }

    @Test
    public void powerTest() {
        int x = 2;
        int n = 4;
        resultDouble = test.power(x, n);
        System.out.println(String.format("power(%d, %d) : %.0f", x, n, resultDouble));
    }

    @Test
    public void fibonacciTest() {
        int n = 4;
        result = test.fibonacci(n);
        System.out.println(String.format("fibonacci(%d) : %d", n, result));
    }

    @Test
    public void gcdOrgTest() {
        int m = 10;
        int n = 3;
        System.out.println(String.format("gcdOrg() m %% n : %d", m % n));
        result = test.gcdOrg(m, n);
        System.out.println(String.format("gcdOrg(%d, %d) : %d", m, n, result));
    }

    @Test
    public void gcdTest() {
        int m = 3;
        int n = 10;
        System.out.println(String.format("gcd() m %% n : %d", m % n));
        result = test.gcd(m, n);
        System.out.println(String.format("gcd(%d, %d) : %d", m, n, result));
    }
}
