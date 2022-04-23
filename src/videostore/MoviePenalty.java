package videostore;

class MoviePenalty {
    private final int penaltyDays;
    private final double penaltyAmount;

    MoviePenalty(int penaltyDays, double penaltyAmount) {
        this.penaltyDays = penaltyDays;
        this.penaltyAmount = penaltyAmount;
    }

    int getPenaltyDays() {
        return penaltyDays;
    }

    double getPenaltyAmount() {
        return penaltyAmount;
    }
}
