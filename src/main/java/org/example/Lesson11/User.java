package org.example.Lesson11;

public class User extends BaseUser {

    public User(int id, String name) {
        super(id, name);
    }

    @Override
    public void auth(String login, String password) {
        System.out.println("Авторизация юзера прошла успешно");
    }

    public void deleteAccount() {
        System.out.println("Удалить аккаунт");
    }
}
