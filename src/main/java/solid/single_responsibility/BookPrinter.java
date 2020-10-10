package solid.single_responsibility;

public class BookPrinter {
    private Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    public void printInfo(){
        // prints information about the book
    }

    public void printText(){
        // prints the text of the book
    }

}
