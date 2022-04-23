package videostore;

class ChildrenMovie extends MovieWithPenalty {

    ChildrenMovie(String title) {
        super(title, 1.5, new MoviePenalty(3, 1.5));
    }
}
