package mapdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

public class Demo4FilterMap {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Utils.vehicles
                .forEach(name -> {
                    Employee employee = new Employee(1, name, new Random().nextDouble() * 1000);
                    employeeList.add(employee);
                });

        List<Double> salaryList = employeeList
                .stream()
                .filter(employee -> employee.salary > 500) //filtering
                .map(employee -> employee.salary)
                .toList();

        System.out.println(salaryList);

    }
}
