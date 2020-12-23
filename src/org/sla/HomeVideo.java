package org.sla;

public class HomeVideo extends Film {
    // Fields
    String releaseDate;
    int allSales;
    int vhsSales;
    int dvdSales;
    int bluraySales;

    public HomeVideo(int rank, String title, int releaseYear, long gross, String releaseDate, int allSales, int vhsSales, int dvdSales, int bluraySales) {
        super(rank, title, releaseYear, gross);
        this.releaseDate = releaseDate;
        this.allSales = allSales;
        this.vhsSales = vhsSales;
        this.dvdSales = dvdSales;
        this.bluraySales = bluraySales;
    }
}
