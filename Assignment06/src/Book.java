public class Book extends SalesItem{

    private String author;
    private int numPages;

    public Book(int newCode, double newPrice, int newQuantity, String newAuthor, int newNumPages) {
        super(newCode, newPrice, newQuantity);
        setAuthor(newAuthor);
        setNumPages(newNumPages);
    }
    
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public double monthlyPromo(){
        return getPrice() * 0.97;
    }

    @Override
    public String toString(){
        return super.toString() + "\t" + author + "\t" + numPages;
    }
}