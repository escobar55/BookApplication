public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("Murach");
        book1.setTitle("Oracle SQL/PLSQL");
        book1.setDescription("Master SQL statements");

        book1.getDisplayText();
    }
}
