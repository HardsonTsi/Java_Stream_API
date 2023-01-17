package filterdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        List.of("PC", "Iphone 13", "Mercedes", "Dell")
                .forEach(productName -> {
                    Product product = new Product(1, productName, new Random().nextDouble() * 1000);
                    productList.add(product);
                });

        //products price > 500
        System.out.println("========");
        productList.stream()
                .filter(product -> product.price > 500)
                .forEach(System.out::println);

    }
}
