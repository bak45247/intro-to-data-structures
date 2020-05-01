public class Cart {
    
    private SalesItem[] itemsList;
    private int currentNumItems;

    public Cart(int totalItems){
        itemsList = new SalesItem[totalItems];
        currentNumItems = 0;
    }

    public void addItem(SalesItem toAdd){
        itemsList[currentNumItems] = toAdd;
    }

    public double cartTotalCost(){
        double total = 0.0;
        for(int i = 0; i < currentNumItems; i++)
            total += itemsList[i].getPrice();
        
        return total;
    }

    public SalesItem getAtIndex(int index){
        return itemsList[index];
    }

    public int countType(int type){
        int total = 0;

        if(type == 1){ // book
            for(int i = 0; i < currentNumItems; i++){
                if(itemsList[i] instanceof Book)
                    total += 1;
            }
        }else if(type == 2){ // dictionary
            for(int i = 0; i < currentNumItems; i++){
                if(itemsList[i] instanceof Dictionary)
                    total += 1;
            }
        }else{ // cd
            for(int i = 0; i < currentNumItems; i++){
                if(itemsList[i] instanceof AudioCD)
                    total += 1;
            }
        }

        return total;
    }

    public String toString(){
        String toReturn = "";

        for(int i = 0; i < currentNumItems; i++)
            toReturn += itemsList[i] + "\n";

        return toReturn += cartTotalCost();
    }
}