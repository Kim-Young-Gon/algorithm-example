import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
    public String name;
    public int quantity;

    public Fruit(final String name, final int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{").append("name:").append(name).append(",").append("quantity:").append(quantity).append("}");
        return result.toString();
    }

    @Override
    public int compareTo(Fruit o) {
        int result = 0;
        if (false) {
            result = name.compareTo(o.name);
        }
        if (true) {
            result = quantity - o.quantity;
        }
        return result;
    }

    public static Comparator<Fruit> nameSort = Comparator.comparing(o -> o.name);
    public static Comparator<Fruit> quantitySort = Comparator.comparingInt(o -> o.quantity);
}
