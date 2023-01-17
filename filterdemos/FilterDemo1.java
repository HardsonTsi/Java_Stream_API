package filterdemos;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo1 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        List<Integer> evenNumbersList;

        //add values to numberList
        for (int i = 0; i < 50; i++) {
            numberList.add(i);
        }

        //get even numbers
        evenNumbersList = numberList.stream().filter(number -> number % 2 == 0).toList();

        System.out.println("====Even numbers====");
        evenNumbersList.forEach(System.out::println);
    }
}
