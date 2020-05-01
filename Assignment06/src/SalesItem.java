public abstract class SalesItem {
    private int code;
    private double price;
    private int quantity;

    public SalesItem(int newCode, double newPrice, int newQuantity){
        setCode(newCode);
        setPrice(newPrice);
        setQuantity(newQuantity);
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double itemTotalCost(){
        return price * quantity;
    }

    public double monthlyPromo(){
        return price;
    }

    public String toString(){
        return code + "\t" + price + "\t" + quantity;
    }
}