package videostore;

import static org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE;
import static org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO;

class NewReleaseMovie extends Movie {

    NewReleaseMovie(String title) {
        super(title, 3);
    }

    @Override
    double determineAmount(int daysRented) {
        return daysRented * getBaseAmount();
    }

    @Override
    int determineFrequentRenterPoints(int daysRented) {
        return daysRented > INTEGER_ONE ? INTEGER_TWO : DEFAULT_FREQUENT_RENTER_POINTS;
    }
}
