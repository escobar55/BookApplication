import java.util.ArrayList;

public class BookDB extends Book {
    private ArrayList<Book> bookDB;


    public BookDB() {
    }//default constructor

    public ArrayList<Book> getBookDB() {
        return bookDB;
    }

    public void setBookDB(ArrayList<Book> bookDB) {
        this.bookDB = bookDB;
    }

    public static String booksDB(String inputSku){ ;
        if(inputSku.equalsIgnoreCase("java1001")){
            //Match the sku with a book and find return the book

        }

        return;

    }
}

