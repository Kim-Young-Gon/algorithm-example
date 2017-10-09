import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Before;
import org.junit.Test;

public class Code04Test {
    private Code04 test;
    private int result;

    @Before
    public void init() {
        test = new Code04();
    }

    @Test
    public void lengthTest() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(String.format("org length(%s) : %d", str, str.length()));
        result = test.length(str);
        System.out.println(String.format("count length(%s) : %d", str, result));
    }

    @Test
    public void printCharsTest() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(String.format("printChars(%s) : ", str));
        test.printChars(str);
        System.out.println("");
    }

    @Test
    public void printCharsReverseTest() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(String.format("printCharsReverse(%s) : ", str));
        test.printCharsReverse(str);
        System.out.println("");
    }

    @Test
    public void printInBinaryTest() {
        int n = 10;
        System.out.print(String.format("printInBinary(%d) : ", n));
        test.printInBinary(n);
        System.out.println("");
    }

    @Test
    public void sumTest() {
        int n = 5;
        int[] data = {1, 3, 5, 7, 9};
        result = test.sum(n, data);
        System.out.println(String.format("sum(%d, %s) : %d", n,
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE), result));
    }
}
