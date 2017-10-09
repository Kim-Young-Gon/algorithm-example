import org.junit.Test;

public class Code03Test {
    @Test
    public void funcTest() {
        Code03 test = new Code03();
        int n = 4;
        int result = test.func(n);
        System.out.println(String.format("func(%d) : %d", n, result));
    }

    @Test
    public void factorialTest() {
        Code03 test = new Code03();
        int n = 4;
        int result = test.factorial(n);
        System.out.println(String.format("factorial(%d) : %d", n, result));
    }

    @Test
    public void powerTest() {
        Code03 test = new Code03();
        int x = 2;
        int n = 4;
        double resultDouble = test.power(x, n);
        System.out.println(String.format("power(%d, %d) : %.0f", x, n, resultDouble));
    }

    @Test
    public void fibonacciTest() {
        Code03 test = new Code03();
        int n = 4;
        int result = test.fibonacci(n);
        System.out.println(String.format("fibonacci(%d) : %d", n, result));
    }

    @Test
    public void gcdOrgTest() {
        Code03 test = new Code03();
        int m = 10;
        int n = 3;
        System.out.println(String.format("gcdOrg() m %% n : %d", m % n));
        int result = test.gcdOrg(m, n);
        System.out.println(String.format("gcdOrg(%d, %d) : %d", m, n, result));
    }

    @Test
    public void gcdTest() {
        Code03 test = new Code03();
        int m = 3;
        int n = 10;
        System.out.println(String.format("gcd() m %% n : %d", m % n));
        int result = test.gcd(m, n);
        System.out.println(String.format("gcd(%d, %d) : %d", m, n, result));
    }
}
