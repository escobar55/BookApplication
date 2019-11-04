import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {

        //Create Book1
        Book book1 = new Book();
        book1.setAuthor("Murach");
        book1.setTitle("Oracle SQL");
        book1.setDescription("Master SQL statements");
        book1.setInStock(true);

        //Create Book2
        Book book2 = new Book();
        book2.setAuthor("Escobar");
        book2.setTitle("Travel Colombia");
        book2.setDescription("Tips and ideas of where to go in Colombia");
        book2.setInStock(false);

        //Display to the user our books
        book1.getDisplayText(); //display book1
        book2.getDisplayText(); //display book2

        //Ask the user which book he/she would like to purchase
        Scanner key = new Scanner(System.in);
        System.out.println(); //just a space
        System.out.println("Which book would you like to purchase? ");
        String bookName = key.nextLine();

        //Ask the user for the quantity of books
        System.out.println("Please enter the quantity of books: ");
        int quantity = key.nextInt();
        if(bookName.equalsIgnoreCase("Oracle SQL")){
            book1.getTotalPrice(quantity);
        }

        if(bookName.equalsIgnoreCase("Travel Colombia")){
            book2.getTotalPrice(quantity);
        }

        System.out.println(); //just a space

        //********** Calls the arrayList from the BookDB class *******************//
        ArrayList<Book> booksArrayList = new ArrayList<>();
        Collections.addAll(booksArrayList, book1, book2);
        BookDB bookDB = new BookDB();
        bookDB.setBookDB(booksArrayList);
        for (Book b : bookDB.getBookDB()){
            b.getDisplayText();
        }
        //***********************************************************************//


    }
}
