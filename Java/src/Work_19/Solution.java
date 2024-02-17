package Work_19;

import java.util.*;

public class Solution<T, K, V> {
    private T variableT;
    private K variableK;
    private V variableV;

    public Solution(T variableT, K variableK, V variableV) {
        this.variableT = variableT;
        this.variableK = variableK;
        this.variableV = variableV;
    }

    public List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<T>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public Map<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values should have the same length");
        }

        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        Solution<String, Integer, Double> solution = new Solution<>("String", 10, 3.14);

        List<String> stringList = solution.newArrayList("Hello", "World");
        System.out.println("ArrayList: " + stringList);

        Set<Integer> integerSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("HashSet: " + integerSet);

        Integer[] keys = {1, 2, 3};
        Double[] values = {1.1, 2.2, 3.3};
        Map<Integer, Double> map = solution.newHashMap(keys, values);
        System.out.println("HashMap: " + map);
    }
}