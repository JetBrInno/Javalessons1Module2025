package org.example.Lesson12;

public class Genres {
    private String title;
    private int id;
    private int popularity;

    private Genres(String title, int id, int popularity) {
        this.title = title;
        this.id = id;
        this.popularity = popularity;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getPopularity() {
        return popularity;
    }

    public static final Genres SCI_FI = new Genres("Научная фантастика", 1, 10002124);
    public static final Genres ACTION = new Genres("Action", 2, 1052302124);
    public static final Genres FANTASY = new Genres("Фантастика", 3, 540002124);
    public static final Genres COMEDY = new Genres("Комедия", 4, 1532526262);


//
//    public static int x = 5;
//    public static final String y = new String("10");
}
