import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;

public class Code04Test {
    @Test
    public void lengthTest() {
        Code04 test = new Code04();
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(String.format("org length(%s) : %d", str, str.length()));
        int result = test.length(str);
        System.out.println(String.format("count length(%s) : %d", str, result));
    }

    @Test
    public void printCharsTest() {
        Code04 test = new Code04();
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(String.format("printChars(%s) : ", str));
        test.printChars(str);
        System.out.println("");
    }

    @Test
    public void printCharsReverseTest() {
        Code04 test = new Code04();
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(String.format("printCharsReverse(%s) : ", str));
        test.printCharsReverse(str);
        System.out.println("");
    }

    @Test
    public void printInBinaryTest() {
        Code04 test = new Code04();
        int n = 10;
        System.out.print(String.format("printInBinary(%d) : ", n));
        test.printInBinary(n);
        System.out.println("");
    }

    @Test
    public void sumTest() {
        Code04 test = new Code04();
        int n = 5;
        int[] data = {1, 3, 5, 7, 9};
        int result = test.sum(n, data);
        System.out.println(String.format("sum(%d, %s) : %d", n,
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE), result));
    }
}
