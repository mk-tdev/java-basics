package com.mk.others;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();

        System.out.println(title + " is a " + instanceType + " film.");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'H' -> new Horror(title);
            case 'T' -> new Thriller(title);
            default -> new Movie(title);
        };
    }

    @Override
    public String toString() {
        return "com.mk.others.Movie{" +
                "title='" + title + '\'' +
                '}';
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    public void watchAdventure() {
        System.out.println("Watching an adventure");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf(".. %s%n".repeat(3), "Pleasant scenes", "Scary Drama", "Something bad happens");
    }
}

class Horror extends Movie {
    public Horror(String title) {
        super(title);
    }

    public void watchHorror() {
        System.out.println("Watching an horror");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf(".. %s%n".repeat(3), "Scary scenes", "Dark", "Something bad happens");
    }
}

class Thriller extends Movie {
    public Thriller(String title) {
        super(title);
    }

    public void watchThriller() {
        System.out.println("Watching an com.mk.others.Thriller");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf(".. %s%n".repeat(3), "Unpleasant scenes", "Scary Scenes", "Confusing Ending");
    }
}