package videostore;

abstract class MovieWithPenalty extends Movie {

    private final MoviePenalty moviePenalty;

    MovieWithPenalty(String title, double baseAmount, MoviePenalty moviePenalty) {
        super(title, baseAmount);
        this.moviePenalty = moviePenalty;
    }

    protected int getPenaltyDays() {
        return moviePenalty.getPenaltyDays();
    }

    protected double getPenaltyAmount() {
        return moviePenalty.getPenaltyAmount();
    }

    @Override
    double determineAmount(int daysRented) {
        return daysRented > getPenaltyDays() ? getBaseAmount() + (daysRented - getPenaltyDays()) * getPenaltyAmount()
                : getBaseAmount();
    }

    @Override
    int determineFrequentRenterPoints(int daysRented) {
        return DEFAULT_FREQUENT_RENTER_POINTS;
    }
}
