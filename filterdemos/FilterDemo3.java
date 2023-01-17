package filterdemos;

import java.util.List;

public class FilterDemo3 {
    public static void main(String[] args) {

        List<String> words = List.of("LDC", "null", "LaLiga", "null", "Premier League", "null", "Ligue 1", "Bundesliga",
                "null");
        System.out.println("=====All words====");
        words.forEach(System.out::println);

        List<String> wordsNotNull = words
                .stream().filter(w -> !w.equals("null")).toList();
        System.out.println("====Word != null");
        wordsNotNull.forEach(System.out::println);

    }
}
