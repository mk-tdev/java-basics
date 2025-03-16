package com.mk.others;

public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Shark");
        movie.watchMovie();


        Adventure shark = (Adventure) Movie.getMovie("A", "Shark");
        shark.watchMovie();

        Object horror = Movie.getMovie("H", "The Nun");
        Horror horrorMovie = (Horror) horror;
        horrorMovie.watchHorror();

        var inception = Movie.getMovie("T", "Inception");
        inception.watchMovie();

        var theCall = new Thriller("The Call");
        theCall.watchThriller();

        // find type
//        Object unknownObject = com.mk.others.Movie.getMovie("A", "Tintin");
        Object unknownObject = Movie.getMovie("H", "Conjuring");

        if (unknownObject.getClass().getSimpleName() == "com.mk.others.Adventure") {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof Thriller) {
            ((Thriller) unknownObject).watchThriller();
        } else if (unknownObject instanceof Horror hor) {
            hor.watchHorror();
        }
    }
}
