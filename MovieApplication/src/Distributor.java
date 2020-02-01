import java.util.Arrays;

public class Distributor {

    /*
     * instance variables name - distributors name address - distributors address
     * phone - distributors phone number [string] movies - movies distributed
     * [Array] numberOfMovies - number of movies distibuted
     */
    private String name;
    private String address;
    private String phone;
    private Movie[] movies;
    private int numberOfMovies;

    public Distributor(String newName, String newAddress, String newPhone) {
        setName(newName);
        setAddress(newAddress);
        setPhone(newPhone);
        movies = new Movie[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        name = newname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String newPhone) {
        phone = newPhone;
    }

    public Movie[] getMovies() {
        return Arrays.copyOf(movies, numberOfMovies);
    }

    /*
     * return - true if we can add the movie return - false if we are adding a
     * duplicate or if there are already 5 Add a movie by Movie object
     */
    public boolean addMovie(Movie newMovie) {
        if (numberOfMovies == 5)
            return false;

        for (int i = 0; i < numberOfMovies; i++) {
            if (movies[i].equals(newMovie))
                return false;
        }
        movies[numberOfMovies] = newMovie;
        numberOfMovies += 1;
        return true;
    }

    /*
     * Throws error if the movie is invalid Override allows us to add movies by the
     * items that would be in a constructor
     */
    public boolean addMovie(String newName, String newDirectorName, double earnings, int newGenre) throws Exception {
        if (numberOfMovies == 5)
            return false;

        Movie temp = new Movie(newName, newDirectorName, newGenre);
        temp.addToEarnings(earnings);

        for (int i = 0; i < numberOfMovies; i++) {
            if (movies[i].equals(temp))
                return false;
        }
        movies[numberOfMovies] = temp;
        numberOfMovies += 1;
        return true;
    }

    public int totalNumberOfMovies() {
        return numberOfMovies;
    }

    public double totalEarnings() {
        double total = 0;

        for (int i = 0; i < numberOfMovies; i++) {
            total += movies[i].getEarnings();
        }

        return total;
    }

    public int getNumGenre(int numGenre) {
        if (numGenre > 0 || numGenre > 2)
            return -1;

        int total = 0;
        for (int i = 0; i < numberOfMovies; i++) {
            if (numGenre == movies[i].getGenre())
                total += 1;
        }

        return total;
    }

    public double getTax(double taxRate, Distributor distributor) {
        return distributor.totalEarnings() * taxRate;
    }

    public boolean equals(Distributor compare) {
        if (compare.getName().toLowerCase().equals(name.toLowerCase()))
            return true;
        return false;
    }

    public String toString() {
        String toReturn = "The Distributors name is: " + name + ", the address is; " + address + "the phone number is: "
                + phone + "\n they distribute " + numberOfMovies + " and they have made: " + totalEarnings() + "$\n\n";

        for (int i = 0; i < numberOfMovies; i++) {
            toReturn += movies[i].toString() + "\n";
        }

        return toReturn;
    }
}