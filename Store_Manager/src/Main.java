import java.io.IOException;

import controller.BookManager;
import model.Book;

public class Main { 
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book Book1 = new Book("A00","1","2","3",22,1,2,"2");
        Book Book2 = new Book("A02","1","2","3",22,1,2,"2");
        Book Book3 = new Book("A03","1","2","3",22,1,2,"2");
        bookManager.addItem(Book1);
        bookManager.addItem(Book2);
        bookManager.addItem(Book3);
        try {
            bookManager.writeFile();
        } catch (IOException e) {
            System.out.println("Chuong trinh loi");
        }
    }
}