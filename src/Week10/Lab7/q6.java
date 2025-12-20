package Week10.Lab7;

import java.io.*;
import java.util.*;

class Order {
    private String id;
    private String productId;
    private int quantity;

    public Order(String id, String productId, int quantity){
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getId(){
        return id;
    }

    public String getProductId(){
        return productId;
    }

    public int getQuantity(){
        return quantity;
    }

    public String toString(){
        return id + "," + productId + "," + quantity;
    }
}

class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return id + "," + name + "," + price;
    }
}

public class q6 {

    public static void main(String[] args) {
        List<Order> orders = readOrders("src/Week10/files/q6/order.txt");
        List<Product> products = readProducts("src/Week10/files/q6/product.txt");

        System.out.println("ProductID\tProductName\tQuantity\tPricePerUnit\tTotal");

        for(Product product : products){
            int qty = findQuantity(product.getId(), orders);
            if (qty == 0)
                continue;
            double total = qty * product.getPrice();
            System.out.println(product.getId() + "\t" + product.getName() + "\t" + qty + "\t" + product.getPrice() + "\t" + total);
        }
    }

    static List<Order> readOrders(String file){
        List<Order> orders = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while((line = in.readLine()) != null) {
                String[] parts = line.split(",");
                Order order = new Order(parts[0], parts[1], Integer.parseInt(parts[2]));
                orders.add(order);
            }
            in.close();

        } catch (IOException e){
            System.out.println("error with file");
        }

        return orders;
    }

    static List<Product> readProducts(String file){
        List<Product> products = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while((line = in.readLine()) != null) {
                String[] parts = line.split(",");
                Product product = new Product(parts[0], parts[1], Double.parseDouble(parts[2]));
                products.add(product);
            }
            in.close();

        } catch (IOException e){
            System.out.println("error with file");
        }

        return products;
    }

    static int findQuantity(String productId, List<Order> orders){
        for(Order order : orders){
            if(order.getProductId().equals(productId))
                return order.getQuantity();
        }
        return 0;
    }
}