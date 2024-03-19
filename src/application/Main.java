package application;

import entities.Product;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Tablet",150.00));
        list.add(new Product("Mobile",550.00));

        double factor = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice()*factor));

        list.forEach(System.out::println);


    }
}