public class Polygon {

    private int numVerticies;
    private Point[] verticies;

    // look at lecture code to fill this class
    public int getNumVerticies() {
        return numVerticies;
    }

    public Point[] getVerticies(){
        return verticies;
    }

    // Example moving into movie distributor class
    // returns the max X coordinate in the list of verticies
    // If it was me, I would return the whole point
    public double maxXCoodinate() {
        double maxX = this.verticies[0].getX();

        for (int i = 0; i < this.numVerticies; i++) {
            if (this.verticies[i].getX() > maxX)
                ;
            maxX = this.verticies[i].getX();
        }

        return maxX;
    }
}