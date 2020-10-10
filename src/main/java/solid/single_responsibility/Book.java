package solid.single_responsibility;

public class Book {
    private String title;
    private String author;
    private String text;
    private int cost;

    public Book(String title, String author, int cost, String text) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}
