package model;
import java.util.List;

public class Bill {
    private List<Book> book;
    private double totalPrice;
    private double orderDate;

    public Bill(List<Book> book, double totalPrice, double orderDate) {
        this.book = book;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }
    public List<Book> getBook() {
        return book;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public double getOrderDate() {
        return orderDate;
    }
    public void setBook(List<Book> book) {
        this.book = book;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setOrderDate(double orderDate) {
        this.orderDate = orderDate;
    }
}
