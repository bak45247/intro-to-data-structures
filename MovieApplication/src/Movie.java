public class Movie {
    /*
     * Instance Variables name - name of movie directorName - name of director
     * earnings - earnings from movie genre - Comedy [0] Action [1] Fiction [2]
     */

    private String name;
    private String directorName;
    private double earnings;
    private int genre;

    public Movie(String newName, String newDirectorName, int newGenre) throws Exception {
        setName(newName);
        setDirectorName(newDirectorName);
        earnings = 0;
        setGenre(newGenre);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String newDirectorName) {
        directorName = newDirectorName;
    }

    public double getEarnings() {
        return earnings;
    }

    public int getGenre() {
        return genre;
    }

    public String getGenreString() {
        if (genre == 0)
            return "Comedy";
        else if (genre == 1)
            return "Action";
        else
            return "Fiction";
    }

    /*
     * Throws exception if the genre is greater than 2 or less than 0
     */
    public void setGenre(int newGenre) throws Exception {
        if (newGenre > 2 || newGenre < 0)
            throw new Exception("The genre is invalid");
        genre = newGenre;
    }

    public double addToEarnings(double earningsToAdd) {
        return earnings += earningsToAdd;
    }

    public boolean equals(Movie compare) {
        if (compare.name.equals(name)) {
            if (compare.directorName.equals(directorName)) {
                if (compare.genre == genre)
                    return true;
            }
        }
        return false;
    }

    public String toString() {
        return "The movie title is: " + name + "\n The director is: " + directorName + "\n The movie earned: "
                + earnings + "$" + "\n and the genre is: " + getGenre();
    }
}