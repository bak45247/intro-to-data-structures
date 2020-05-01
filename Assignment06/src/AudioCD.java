public class AudioCD extends SalesItem{

    private String label;
    private int playingTime;

    public AudioCD(int newCode, double newPrice, int newQuantity, String newLabel, int newPlayingTime) {
        super(newCode, newPrice, newQuantity);
        setLabel(newLabel);
        setPlayingTime(newPlayingTime);
    }
    
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPlayingTime() {
        return this.playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public double monthlyPromo(){
        return getPrice() * 0.95;
    }

    @Override
    public String toString(){
        return super.toString() + "\t" + label + "\t" + playingTime;
    }
}