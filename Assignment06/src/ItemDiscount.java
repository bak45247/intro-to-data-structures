public class ItemDiscount {

    private int discount;
    private int qualifiedQuantity;

    public ItemDiscount(int newDiscount, int newQualifiedQuantity){
        discount = newDiscount;
        qualifiedQuantity = newQualifiedQuantity;
    }

    public double calculateDiscount(SalesItem item){
        if(item.getQuantity() > qualifiedQuantity)
            return item.getPrice() * ((double)discount / 100);
        return 0.0;
    }
}