package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> newList;

        // newList = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        // newList = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // newList = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        newList = list.stream().map((Product p) -> p.getName().toUpperCase()).collect(Collectors.toList());

        newList.forEach(System.out::println);
    }
}
