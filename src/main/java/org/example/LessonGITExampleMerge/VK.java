package org.example.LessonGITExampleMerge;

import org.example.Lesson11.Admin;
import org.example.Lesson11.Moderator;
import org.example.Lesson12.Role;

public class VK {
    public static void main(String[] args) {
        on(Role.MODERATOR);
    }

    public static void on(Role role) {
        Moderator superUser;
        if (role == Role.MODERATOR) {
            superUser = new Moderator(1, "abcbagds");
            System.out.println("хэйхэй");
        }
        else if (role == Role.ADMIN) {
            superUser = new Admin(5, "admin");
        }
        else if (role == Role.SUPERADMIN) {
            superUser = new Admin(12, "superadmin");
        }
        else {
            superUser = new Moderator(123,"запасноймодератор");
        }
        superUser.auth("abc","123");
    }


    public static void newMethod() {
        System.out.println("Какой-то метод");
    }
}
