public class Dictionary extends Book{

    private String language;
    private int numDefinitions;

    public Dictionary(int newCode, double newPrice, int newQuantity, String newAuthor, int newNumPages, String newLanguage, int newNumDefinitions) {
        super(newCode, newPrice, newQuantity, newAuthor, newNumPages);

        setLanguage(newLanguage);
        setNumDefinitions(newNumDefinitions);
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumDefinitions() {
        return this.numDefinitions;
    }

    public void setNumDefinitions(int numDefinitions) {
        this.numDefinitions = numDefinitions;
    }

    public double getRatio(){
        return (double)getNumPages() / numDefinitions;
    }

    @Override
    public String toString(){
        return super.toString() + "\t" + language + "\t" + numDefinitions;
    }
}