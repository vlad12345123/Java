public class Book {
    private int id;
    private String name;
    private String author;
    private boolean illustration;
    private double price;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setIllustration(boolean illustration){
        this.illustration = illustration;
    }

    public boolean getIllustration(){
        return illustration;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String Show(){
        return "Id: " + id + "\n" +
                "Price: " + price + "\n" +
                "Author: " + author + "\n" +
                "Illustration: " + illustration + "\n" +
                "Price: " + price + "\n";
    }

    public Book(){

    }

    public Book(int id, String name, String author, boolean illustration){
        this.id = id;
        this.name = name;
        this.author = author;
        this.illustration = illustration;
    }

    public Book(int id, String name, String author, boolean illustration, double price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.illustration = illustration;
        this.price = price;
    }
}
