package 정렬테스트;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};

        Comparator<String> comparator = (o1, o2) -> {
            if(o1.length() > o2.length()) return 1;
            else {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return -1; // 현 상태 유지
            }
        };
        Arrays.sort(fruit, comparator);
        System.out.println(Arrays.toString(fruit));

    }
}
