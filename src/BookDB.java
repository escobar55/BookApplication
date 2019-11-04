import java.util.ArrayList;

public class BookDB {
    private ArrayList<Book> bookDB;
    private String sku;

    public BookDB() {
    }//default constructor

    public BookDB(String sku){
        this.sku = sku;
    }


    public ArrayList<Book> getBookDB() {
        return bookDB;
    }

    public void setBookDB(ArrayList<Book> bookDB) {
        this.bookDB = bookDB;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}

