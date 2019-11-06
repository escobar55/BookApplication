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

    //Create an Array do display the books according to the SKU
    public ArrayList<Book> check(String inputSku){
        //create an array list to store the matched books
        boolean checker;
        ArrayList<Book> matched = new ArrayList<>();

        //loop through the array
        for(Book b : bookDB){
            checker = true;
            for(String d : b.getSku()){
                if(!d.equalsIgnoreCase(inputSku)){
                    checker = false;
                    //System.out.println("not added");
                }
                break;
            }
            if(checker == true){
                matched.add(b);
                //System.out.println("gets added");
            }

        }
        return matched;
    }
    public void print(ArrayList<Book> matched){
        for(Book c : matched){
            c.getDisplayText();
        }
    }



}

