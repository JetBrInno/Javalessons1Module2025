package org.example.Lesson12;

import org.example.Lesson11.Admin;
import org.example.Lesson11.Moderator;

public class VK {
    public static void main(String[] args) {
        on(Role.MODERATOR);
    }

    public static void on(Role role) {
        Moderator superUser;
        if (role == Role.MODERATOR) {
            superUser = new Moderator(1, "abcbagds");
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
}
