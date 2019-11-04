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

        //create various DB book using overloaded constructor
        Book book01 = new Book("Head First Java", "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", 47.50, true, "Java1001");
        Book book02 = new Book("Thinking in Java", "Bruce Eckel",
                "Details about Java under the hood", 20.00, true, "Java1002" );
        Book book03 = new Book("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
                "Everything you need to know in one place", 45.00, true, "Orcl1003" );
        Book book04 = new Book("Automate the Boring Stuff with Python", "Al Sweigart",
                "Fun with Python", 10.50, true, "Python1004" );
        Book book05 = new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, true, "Zombie1005" );
        Book book06 = new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris",
                "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true, "Rasp1006" );

        //Ask the user for a sku
        System.out.println("Please enter a SKU: ");
        String inputSku = key.nextLine();


    }
}
