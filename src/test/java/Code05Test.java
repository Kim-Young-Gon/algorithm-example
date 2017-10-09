import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Code05Test {
    private Code05 test;
    private int[] data;
    private int begin, end, target, result;
    private String[] items;

    @Before
    public void init() {
        test = new Code05();
        data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        items = new String[]{"일", "이", "삼", "사", "오", "육", "칠", "팔", "구", "영"};
    }

    @Test
    public void searchFirstTest() {
        begin = 1;
        end = 6;
        target = 5;
        result = test.searchFirst(data, begin, end, target);
        System.out.println(String.format("searchFirst(%s, %d, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, target, result));
    }

    @Test
    public void searchLastTest() {
        begin = 1;
        end = 6;
        target = 5;
        result = test.searchLast(data, begin, end, target);
        System.out.println(String.format("searchLast(%s, %d, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, target, result));
    }

    @Test
    public void searchMiddleTest() {
        begin = 1;
        end = 6;
        target = 5;
        result = test.searchMiddle(data, begin, end, target);
        System.out.println(String.format("searchMiddle(%s, %d, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, target, result));
    }

    @Test
    public void findMaxFirstTest() {
        begin = 1;
        end = 8;
        result = test.findMaxFirst(data, begin, end);
        System.out.println(String.format("findMaxFirst(%s, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, result));
    }

    @Test
    public void findMaxMiddleTest() {
        begin = 1;
        end = 8;
        result = test.findMaxMiddle(data, begin, end);
        System.out.println(String.format("findMaxMiddle(%s, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, result));
    }

    @Test
    public void binarySearchTest() {
        Arrays.sort(items);// 오름차순 정렬
//        Arrays.sort(items, Collections.reverseOrder());// 내림차순 정렬
        String target = "오";
        begin = 1;
        end = 8;
        result = test.binarySearch(items, target, begin, end);
        System.out.println(String.format("binarySearch(%s, %s, %d, %d) : %d",
                ToStringBuilder.reflectionToString(items, ToStringStyle.SIMPLE_STYLE),
                target, begin, end, result));
    }
}
