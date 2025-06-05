package org.example.Lesson11;

public class Moderator extends BaseUser {

    public Moderator(int id, String name) {
        super(id, name); // выполняет конструктор родителя
        System.out.println("Создан модератор");
    }

    @Override
    public void auth(String login, String password) {
        System.out.println("Вводим логин");
        System.out.println("Вводим пароль");
        System.out.println("Модератор вошел в систему");
    }

    public void ban(String name) {
        System.out.println("Пользователь " + name + " забанен (by " + this.name + ")");
    }
}
