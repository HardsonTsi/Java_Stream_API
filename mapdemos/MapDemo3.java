package mapdemos;

import java.util.List;

public class MapDemo3 {
    public static void main(String[] args) {

        List<Integer> numberList = List.of(1, 4, 3, 7, 8, 1, 0);

        numberList
                .stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

    }
}
