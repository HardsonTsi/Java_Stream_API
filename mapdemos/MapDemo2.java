package mapdemos;

import java.util.ArrayList;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {

        List<String> vehicles = Utils.vehicles;
        List<Integer> lengths = new ArrayList<>();

        lengths = vehicles
                .stream()
                .map(String::length)
                .toList();

        System.out.println(lengths);

    }
}
