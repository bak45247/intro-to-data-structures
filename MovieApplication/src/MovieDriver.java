public class MovieDriver {
    public static void main(String[] args) {
        try {
            Movie movie1 = new Movie("Thor", "Steven Spelberg", 2);
            Movie movie2 = new Movie("Computer Games", "Richard Taft", 1);
            Movie movie3 = new Movie("Mice: Where to Find Them", "Amy Thomas", 0);
            Movie movie4 = new Movie("A Vegans Guide to Life", "Ron Swanson", 1);
            Movie movie5 = new Movie("Science Movie 3D", "Stuart Little", 0);
            Movie movie6 = new Movie("Programming to Live", "Dick Thorson", 2);

            Distributor distributor1 = new Distributor("Rolfs Films", "34 Hollywood Dr, Michigan 55893",
                    "982-431-3310");
            Distributor distributor2 = new Distributor("Papa Johns Pizza and Films", "Papa Johns", "651-318-2284");

            distributor1.addMovie(movie1);
            distributor1.addMovie(movie2);
            distributor1.addMovie(movie3);
            distributor1.addMovie(movie4);
            distributor1.addMovie(movie5);
            // distributor1.addMovie(movie6);

            distributor2.addMovie(movie6);
            distributor2.addMovie("Programming for Life", "Ron Thompson", 45.67, 2);

            movie1.addToEarnings(3459230984.21);
            movie2.addToEarnings(23.04);

            if (movie3.equals(movie4))
                System.out.println("The movies are the same :(");
            else
                System.out.println("The movies are different");

            System.out.println(distributor1);
            System.out.println(distributor2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}