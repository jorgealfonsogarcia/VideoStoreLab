package videostore;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;

class Statement {
    private int frequentRenterPoints;
    private double totalAmount;
    private final String customerName;
    private final List<Rental> rentals = new ArrayList<>();

    Statement(String customerName) {
        this.customerName = customerName;
    }

    double getTotal() {
        return totalAmount;
    }

    int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    void addRental(final Rental rental) {
        rentals.add(rental);
    }

    String generate() {
        clearTotals();
        return getHeader() + getRentalLines() + getFooter();
    }

    private void clearTotals() {
        totalAmount = INTEGER_ZERO;
        frequentRenterPoints = INTEGER_ZERO;
    }

    private String getHeader() {
        return String.format("Rental Record for %s%n", customerName);
    }

    private String getRentalLines() {
        return rentals.stream().map(this::getRentalLine).collect(joining());
    }

    private String getRentalLine(final Rental rental) {
        final var rentalAmount = rental.determineAmount();
        frequentRenterPoints += rental.determineFrequentRenterPoints();
        totalAmount += rentalAmount;

        return formatRentalLine(rental, rentalAmount);
    }

    private String formatRentalLine(final Rental rental, final double rentalAmount) {
        return String.format("\t%s\t%s%n", rental.getTitle(), rentalAmount);
    }

    private String getFooter() {
        return String.format("You owed %s%nYou earned %d frequent renter points%n", totalAmount, frequentRenterPoints);
    }
}
