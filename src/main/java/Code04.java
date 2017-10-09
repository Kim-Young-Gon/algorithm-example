public class Code04 {
    /**
     * 문자열의 길이
     * @param str
     * @return
     */
    public int length(final String str) {
        if (str == null || str.equals(""))
            return 0;
        else
            return 1 + length(str.substring(1));
    }

    /**
     * 문자열 출력
     * @param str
     */
    public void printChars(final String str) {
        if (str == null || str.length() == 0)
            return;
        else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    /**
     * 문자열 거꾸로 출력
     * @param str
     */
    public void printCharsReverse(final String str) {
        if (str == null || str.length() == 0)
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    /**
     * 10진수를 2진수로 변환
     * @param n
     */
    public void printInBinary(final int n) {
        if (n < 2)
            System.out.print(n);
        else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    /**
     * 배열의 합
     * @param n
     * @param data
     * @return
     */
    public int sum(final int n, final int[] data) {
        if (n <= 0)
            return 0;
        else
            return sum(n - 1, data) + data[n - 1];
    }
}
