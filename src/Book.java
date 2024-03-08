public class Book {
    private double price;
    private String author;
    private int publishYear;
    private String name;


    public Book(String name, String author, int publishYear, double price) {
        this.price = price;
        this.author = author;
        this.publishYear = publishYear;
        this.name = name;
    }
    public Book(String name, String author){
        this(name, author, 0 , 0);
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

}
