public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    private String sku;

    //default constructor
    public Book(){
    }

    //Overloaded constructor
    public Book(String title, String author, String description, double price, boolean isInStock, String sku) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
        this.sku = sku;
    }

    //getters and setters for title
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    //getters and setters for author
    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    //getters and setters for description
    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    //getters and setters for price
    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //getters and setters for isInStock
    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        this.isInStock = inStock;
    }

    //getters and setters for SKU
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    //method getDisplayText
    public void getDisplayText(){
        System.out.println("Author: " + author + " - Title: " + title + " - Description: " + description);
    }

    //pricing method
    public double getTotalPrice(int quantity){
        double price = 0;

        if(isInStock){
            price = quantity * 20.00;
            System.out.println("The total is: " + price);
        }
        else {
            System.out.println("Sorry, the book is out of stock");
        }

        return price;
    }


}
