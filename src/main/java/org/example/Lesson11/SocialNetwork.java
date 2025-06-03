package org.example.Lesson11;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    public static void main(String[] args) {
        User user1 = new User(1, "Joe");
        Admin admin1 = new Admin(2, "SuperAdmin19");
        Moderator moderator1 = new Moderator(3, "Модер");
        user1.sendMessage("Привет!");
        moderator1.sendMessage("Здравствуй");

        moderator1.ban("Joe");
        admin1.permanentBan("Joe");
        admin1.ban("Joe");
        admin1.sendMessage("Alex hi!");

        List<BaseUser> users = new ArrayList<>();
        users.add(user1);
        users.add(admin1);
        users.add(moderator1);
        System.out.println(users.size());
        for (BaseUser user : users) {
            user.sendMessage("Hello!");
            user.auth("abc", "1241241");
        }

        user1.deleteAccount();



        // Проблемы которые может решить наслеование:
        // 1) не можем выполнить одно и то же действие со всеми разом (например, посчитать их или вывести их айдишники на экран)
        // 2) дублирование кода
    }
}
