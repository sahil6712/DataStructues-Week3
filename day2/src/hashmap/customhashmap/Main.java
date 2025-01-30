package hashmap.customhashmap;

public class Main {
    public static void main(String[] args) {
        // Example usage
        MyHashMap<String, Integer> map = new MyHashMap<>();

        // putting values in hash map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // printing the val
        System.out.println("Value for 'one': " + map.get("one"));
        System.out.println("Value for 'two': " + map.get("two"));


        // removing the second entry
        map.remove("two");
        // should be null
        System.out.println("Value for 'two' after removal: " + map.get("two"));

        // the current size of 2
        System.out.println("Size of map: " + map.size());
    }
}
