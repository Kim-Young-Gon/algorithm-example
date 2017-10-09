public class Code03 {
    /**
     * 0부터 n까지의 합
     * @param n
     * @return
     */
    public int func(final int n) {
        if (n == 0)
            return 1;
        else
            return n + func(n - 1);
    }

    /**
     * n!
     * @param n
     * @return
     */
    public int factorial(final int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    /**
     * x^n
     * @param x
     * @param n
     * @return
     */
    public double power(final double x, final int n) {
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    /**
     * F n-1 + F n-2
     * @param n
     * @return
     */
    public int fibonacci(final int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 두 수의 최대공약수
     * @param m
     * @param n
     * @return
     */
    public int gcdOrg(final int m, final int n) {
        int m1 = m, n1 = n;
        if (m < n) {
            m1 = n;
            n1 = m;
        }
        if (m1 % n1 == 0)
            return n1;
        else
            return gcdOrg(n1, m1 % n1);
    }

    /**
     * 두 수의 최대공약수 간락화
     * @param m
     * @param n
     * @return
     */
    public int gcd(final int m, final int n) {
        if (n == 0)
            return m;
        else
            return gcd(n, m % n);
    }
}
