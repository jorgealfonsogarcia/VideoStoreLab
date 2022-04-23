package videostore;

abstract class Movie {

    static final int DEFAULT_FREQUENT_RENTER_POINTS = 1;

    private final String title;
    private final double baseAmount;

    Movie(String title, double baseAmount) {
        this.title = title;
        this.baseAmount = baseAmount;
    }

    String getTitle() {
        return title;
    }

    protected double getBaseAmount() {
        return baseAmount;
    }

    abstract double determineAmount(int daysRented);

    abstract int determineFrequentRenterPoints(int daysRented);
}
