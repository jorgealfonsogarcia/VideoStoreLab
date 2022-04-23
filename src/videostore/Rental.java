package videostore;

class Rental {
    private final Movie movie;
    private final int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    String getTitle() {
        return movie.getTitle();
    }

    double determineAmount() {
        return movie.determineAmount(daysRented);
    }

    int determineFrequentRenterPoints() {
        return movie.determineFrequentRenterPoints(daysRented);
    }

}