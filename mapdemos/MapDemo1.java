package mapdemos;

import java.util.ArrayList;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {

        List<String> vehicles = Utils.vehicles;
        List<String> vehiclesUpperCase = new ArrayList<>();

        //vehicles upperCase
        vehiclesUpperCase = vehicles.stream().map(String::toUpperCase).toList();

        vehiclesUpperCase.forEach(System.out::println);

    }
}
