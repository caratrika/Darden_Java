package lambda;
import java.util.ArrayList;
import java.util.List;
 
class Order {
    private int orderId;
    private double price;
    private String status;
 
    public Order(int orderId, double price, String status) {
        this.orderId = orderId;
        this.price = price;
        this.status = status;
    }
 
    public int getOrderId() {
        return orderId;
    }
 
    public double getPrice() {
        return price;
    }
 
    public String getStatus() {
        return status;
    }
}
 
public class Lambda_q2 {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
   
        orders.add(new Order(1, 15000, "ACCEPTED"));
        orders.add(new Order(2, 8000, "COMPLETED"));
        orders.add(new Order(3, 12000, "PENDING"));
        orders.add(new Order(4, 9000, "ACCEPTED"));
 
        orders.stream()
                .filter(order -> order.getPrice() > 10000 && (order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED")))
                .forEach(order -> System.out.println("Order ID: " + order.getOrderId() + ", Price: " + order.getPrice() + ", Status: " + order.getStatus()));
    }
}