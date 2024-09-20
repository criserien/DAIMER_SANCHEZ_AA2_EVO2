package models;

public class Order {
    private int orderId;
    private int userId;
    private String product;
    private int quantity;
    private String orderDate;

    // Constructor vacío
    public Order() {
    }

    // Constructor con parámetros
    public Order(int orderId, int userId, String product, int quantity, String orderDate) {
        this.orderId = orderId;
        this.userId = userId;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    // Getters y Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    // Método toString para representar el pedido
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", userId=" + userId + ", product=" + product
                + ", quantity=" + quantity + ", orderDate=" + orderDate + "]";
    }
}