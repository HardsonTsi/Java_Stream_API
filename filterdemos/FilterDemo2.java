package filterdemos;

import java.util.List;

public class FilterDemo2 {
    public static void main(String[] args) {

        List<String> names = List.of("Tessi", "Hardson", "Modeste", "Enagnon", "Segla");
        System.out.println("=====All names====");
        names.forEach(System.out::println);

        System.out.println("====Name length > 6====");
        //string lenght > 5
        List<String> longNames = names
                .stream()
                .filter(name -> name.length() > 6)
                .toList();

        longNames.forEach(System.out::println);


    }
}
