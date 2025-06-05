package org.example.Lesson12;

public record MovieR(String title, String genre) {

    public void justMethod(){
        System.out.println("Просто метод" + title);
    }

    public MovieR(String title, String genre) {
        this.title = title;
        this.genre = genre;
        System.out.println("Второй конструктор");
    }
}
