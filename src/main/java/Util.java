import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Util {
    // 배열 출력
    public static void printGrid(final int[][] grid) {
        String printStr = ToStringBuilder.reflectionToString(grid, ToStringStyle.SIMPLE_STYLE);
        printStr = printStr.replaceAll("},", "\r\n")
                .replaceAll("\\{", "").replaceAll("}", "");
        System.out.println("===============");
        System.out.println(printStr);
        System.out.println("===============");
    }
}
