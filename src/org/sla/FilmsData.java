package org.sla;

public class FilmsData {

    public static void main(String[] args) {
	// write your code here
        BoxOfficeFilm film1 = new BoxOfficeFilm(1, "Avengers: Endgame", 2019,2797800564l,1);
        HomeVideo film2 = new HomeVideo(1,"The Lion King", 1995,852000000,"March 3, 1995",47500000,32000000,11900000, 36800000);

        System.out.println("\"" + film1.title + "\" has Box Office ranking #" + film1.rank + " from year " + film1.releaseYear + " grossing $" + film1.gross + " and peaking at rank #" + film1.peak);
        System.out.println("\"" + film2.title + "\" has Home Video ranking #" + film2.rank + " from year " + film2.releaseYear + " (specifically "+ film2.releaseDate + ") grossing $" + film2.gross + " based on " + film2.allSales + " sales");
    }
}
