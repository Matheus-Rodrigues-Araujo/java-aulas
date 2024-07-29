import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;

public class Order_Products_Exercise {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            SimpleDateFormat birthFormat = new SimpleDateFormat("dd/MM/yyyy");

            Client client = new Client("Matheus Rodrigues", "matheus@gmail.com",birthFormat.parse("13/01/2002"));
            Order order = new Order(1, sdf.parse("12/05/2024 18:14:12"),OrderStatus.PENDING_PAYMENT, client);

            Product product1 = new Product("PS5", 3500.00);
            Product product2 = new Product("Skate", 100.00);
            Product product3 = new Product("Boné", 20.00);
            Product product4 = new Product("Kit kat", 2.50);

            OrderItem item1 = new OrderItem(1, product1.getPrice(), product1);
            OrderItem item2 = new OrderItem(2, product2.getPrice(), product2);
            OrderItem item3 = new OrderItem(1, product3.getPrice(), product3);
            OrderItem item4 = new OrderItem(3, product4.getPrice(), product4);

            order.addItem(item1);
            order.addItem(item2);
            order.addItem(item3);
            order.addItem(item4);

            System.out.println(order);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
