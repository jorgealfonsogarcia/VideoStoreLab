package videostore;

class RegularMovie extends MovieWithPenalty {

    RegularMovie(String title) {
        super(title, 2, new MoviePenalty(2, 1.5));
    }
}
