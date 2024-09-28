// Define a generic interface
interface Pair<String, Integer> {
    Integer getValue(); //teeling what to print but not how to print
    String getKe(); //teeling what to print but not how to print
}

// Implement the generic interface
class OrderedPair<String, Integer> implements Pair<String, Integer> {
    private String key;
    private Integer value;

    public OrderedPair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKe() { return key; }
    public Integer getValue() { return value; }
}

class generic_interface {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderedPair<>("One", 1);
        System.out.println(pair.getKey() + " = " + pair.getValue()); // Output: One = 1
    }
}
