import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NormalSortTest {
    private Integer[] list1;
    private List<Integer> list2;
    private char[] list3;
    private Integer[] list4;
    private NormalSort sort;

    @Before
    public void init() {
        list1 = new Integer[] {29, 10, 14, 17, 13};
        list2 = new ArrayList<>(Arrays.asList(list1));
        list3 = new char[] {'A', 'L', 'G', 'O', 'R', 'I', 'T', 'H', 'M'};
        list4 = new Integer[] {31, 8, 48, 73, 11, 3, 20, 29, 65, 15};
        sort = new NormalSort();
    }

    @Test
    public void selectionSortTest() {
        Integer[] result = sort.selectionSort(list1, list1.length - 1);
        System.out.println(String.format("list1 : %s", ToStringBuilder.reflectionToString(result, ToStringStyle.SIMPLE_STYLE)));
    }

    @Test
    public void bubbleSortTest() {
        Integer[] result = sort.bubbleSort(list1, list1.length - 1);
        System.out.println(String.format("list1 : %s", ToStringBuilder.reflectionToString(result, ToStringStyle.SIMPLE_STYLE)));
    }

    @Test
    public void insertionSortTest() {
        List<Integer> result = sort.insertionSort(list2);
        System.out.println(String.format("list2 : %s", result));
    }

    @Test
    public void mergeSortTest() {
        sort.mergeSort(list3, 0, list3.length - 1);
        System.out.println(String.format("list3 : %s", ToStringBuilder.reflectionToString(list3, ToStringStyle.SIMPLE_STYLE)));
    }

    @Test
    public void quickSortTest() {
        sort.quickSort(list4, 0, list4.length - 1);
        System.out.println(String.format("list4 : %s", ToStringBuilder.reflectionToString(list4, ToStringStyle.SIMPLE_STYLE)));
    }
}
