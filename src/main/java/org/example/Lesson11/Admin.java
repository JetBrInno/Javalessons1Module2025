package org.example.Lesson11;

public class Admin extends Moderator {

    public Admin(int id, String name) {
        super(id, name); // выполняет конструктор родителя
    }

    public void permanentBan(String name) {
        System.out.println("Пользователь " + name + " забанен навсегда");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("ВНИМАНИЕ! ПИШЕТ АДМИН! ЧИТАЕМ ВНИМАТЕЛЬНО!");
        System.out.println("Пользователь " + this.name + " отправил сообщение: \"" + message + "\"");
    }

    @Override
    public void auth(String login, String password) {
        System.out.println("Вводим логин");
        System.out.println("Вводим пароль");
        System.out.println("Фэйс контроль");
        System.out.println("Отпечаток пальца");
        System.out.println("Модератор вошел в систему");
    }
}
