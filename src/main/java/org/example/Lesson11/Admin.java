package org.example.Lesson11;

import org.example.Lesson6.EmployeeL6;
import org.example.Lesson6.Notifier;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;
import java.sql.SQLException;

public class Admin extends Moderator implements Notifier, Predicate {

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

    @Override
    public boolean evaluate(RowSet rs) {
        return false;
    }

    @Override
    public boolean evaluate(Object value, int column) throws SQLException {
        return false;
    }

    @Override
    public boolean evaluate(Object value, String columnName) throws SQLException {
        return false;
    }

    @Override
    public void send(String text, EmployeeL6 employee) {

    }

    @Override
    public boolean auth(EmployeeL6 employee) {
        return false;
    }
}
