import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;

import java.util.*;

public class JavaSortTest {
    @Test
    public void arraysSortInt() {
        int[] data = new int[] {4, 5, 6, 1, 2, 3};
        System.out.println(String.format("int : %s", ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE)));
        Arrays.sort(data);
        System.out.println(String.format("Arrays.sort int : %s", ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE)));
        data = new int[] {4, 5, 6, 1, 2, 3, 0, 0};
        System.out.println(String.format("int : %s", ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE)));
        Arrays.sort(data, 0, 7);
        System.out.println(String.format("Arrays.sort int : %s", ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE)));
    }

    @Test
    public void arraysSortString() {
        final String[] data = new String[] {
                "Pineapple", "Apple", "Orange", "Banana", "Icecream", "Coffee", "GreenTea"
        };
        System.out.println(String.format("String : %s", ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE)));
        Arrays.sort(data);
        System.out.println(String.format("Arrays.sort String : %s", ToStringBuilder.reflectionToString(data, ToStringStyle.SIMPLE_STYLE)));
    }

    @Test
    public void arrayListSort() {
        List<String> data = new ArrayList<>();
        data.add("Pineapple");
        data.add("Apple");
        data.add("Orange");
        data.add("Banana");
        data.add("Icecream");
        data.add("Coffee");
        data.add("GreenTea");
        System.out.println(String.format("String List : %s", data));
        Collections.sort(data);
        System.out.println(String.format("Collections.sort String List : %s", data));
    }

    @Test
    public void comparableSort() {
        Fruit[] fruit = new Fruit[4];
        fruit[0] = new Fruit("Pineapple", 70);
        fruit[1] = new Fruit("Apple", 100);
        fruit[2] = new Fruit("Orange", 80);
        fruit[3] = new Fruit("Banana", 90);
        System.out.println(String.format("Fruit Array org : %s", ToStringBuilder.reflectionToString(fruit, ToStringStyle.SIMPLE_STYLE)));
        Arrays.sort(fruit);
        System.out.println(String.format("Fruit Arrays.sort : %s", ToStringBuilder.reflectionToString(fruit, ToStringStyle.SIMPLE_STYLE)));
        Arrays.sort(fruit, Fruit.nameSort);
        System.out.println(String.format("Fruit Arrays.sort name : %s", ToStringBuilder.reflectionToString(fruit, ToStringStyle.SIMPLE_STYLE)));
        Arrays.sort(fruit, Fruit.quantitySort);
        System.out.println(String.format("Fruit Arrays.sort quantity : %s", ToStringBuilder.reflectionToString(fruit, ToStringStyle.SIMPLE_STYLE)));
    }
}
