package com.mk.others;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String smeValue = String.join("-", "1", "2", "3");
        System.out.println(smeValue);

        Movie advMovie = Movie.getMovie("com.mk.others.Adventure", "Lord of the rings");
        advMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("enter: A, H, T or Q for quit");

            String type = s.nextLine();

            if("Qq".contains(type)) {
                break;
            }

            System.out.println("Enter the movie title");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);

            movie.watchMovie();
        }
    }


}