package test;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        boolean isAdded = set.add("Java");
        System.out.println("Kết quả thêm trùng 'Java': " + isAdded); // false
        System.out.println("Tập hợp Set: " + set);
        System.out.println("--- Vòng lặp for-each ---");
        for (String city : set) {
            System.out.println("Thành phố: " + city);
        }
    }

}
