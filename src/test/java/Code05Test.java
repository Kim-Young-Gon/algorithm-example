import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class Code05Test {
    @Test
    public void searchFirstTest() {
        Code05 test = new Code05();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int begin = 1;
        int end = 6;
        int target = 5;
        int result = test.searchFirst(data, begin, end, target);
        System.out.println(String.format("searchFirst(%s, %d, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, target, result));
    }

    @Test
    public void searchLastTest() {
        Code05 test = new Code05();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int begin = 1;
        int end = 6;
        int target = 5;
        int result = test.searchLast(data, begin, end, target);
        System.out.println(String.format("searchLast(%s, %d, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, target, result));
    }

    @Test
    public void searchMiddleTest() {
        Code05 test = new Code05();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int begin = 1;
        int end = 6;
        int target = 5;
        int result = test.searchMiddle(data, begin, end, target);
        System.out.println(String.format("searchMiddle(%s, %d, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, target, result));
    }

    @Test
    public void findMaxFirstTest() {
        Code05 test = new Code05();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int begin = 1;
        int end = 8;
        int result = test.findMaxFirst(data, begin, end);
        System.out.println(String.format("findMaxFirst(%s, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, result));
    }

    @Test
    public void findMaxMiddleTest() {
        Code05 test = new Code05();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int begin = 1;
        int end = 8;
        int result = test.findMaxMiddle(data, begin, end);
        System.out.println(String.format("findMaxMiddle(%s, %d, %d) : %d",
                ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE),
                begin, end, result));
    }

    @Test
    public void binarySearchTest() {
        Code05 test = new Code05();
        String[] items = {"일", "이", "삼", "사", "오", "육", "칠", "팔", "구", "영"};
        Arrays.sort(items);// 오름차순 정렬
//        Arrays.sort(items, Collections.reverseOrder());// 내림차순 정렬
        String target = "오";
        int begin = 1;
        int end = 8;
        int result = test.binarySearch(items, target, begin, end);
        System.out.println(String.format("binarySearch(%s, %s, %d, %d) : %d",
                ToStringBuilder.reflectionToString(items, ToStringStyle.SIMPLE_STYLE),
                target, begin, end, result));
    }
}
