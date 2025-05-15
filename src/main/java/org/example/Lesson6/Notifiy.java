package org.example.Lesson6;

public class Notifiy {
    public static void main(String[] args) {
        EmployeeL6 mark = new EmployeeL6("Mark", "Scout", 40, "mark@google.com", 1000);

        Notifier[] notifiers = {new EmailNotifier(), new SmsNotifier(), new TelegramNotifier()};

        for (Notifier notifier : notifiers) {
            notifier.send("Поздравляю, вам повысили зарплату!", mark);
            notifier.send("Ваша текущая зарплата равна: " + mark.getSalary(), mark);
        }
    }
}
