package org.sla;

public class BoxOfficeFilm extends Film {
    // Fields
    int peak;

    public BoxOfficeFilm(int rank, String title, int releaseYear, long gross, int peak) {
        super(rank, title, releaseYear, gross);
        this.peak = peak;
    }
}
