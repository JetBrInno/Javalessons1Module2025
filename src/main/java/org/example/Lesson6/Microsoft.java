package org.example.Lesson6;

public class Microsoft {
    public static void main(String[] args) {
        EmployeeL6 mark = new EmployeeL6("Mark", "Scout", 40, "mark@google.com", 1000);
        mark.setSalary(1.5);
        mark.setSalary(1.5);

        double marksSalary = mark.getSalary();
        mark.setName("ab");
        System.out.println("Имя: " + mark.getName());
        System.out.println(marksSalary);

        Notifier notifier = new SmsNotifier();

        notifier.send("Поздравляю, вам повысили зарплату!", mark);
        notifier.send("Ваша текущая зарплата равна: " + mark.getSalary(), mark);

    }

    // 1) У однотипных классов методы могут называться по-разному, а выполнять одни и те же задачи. В голове приходится держать все их названия
    // 2) Можно случайно забыть реализовать важную часть программы, например, авторизацию







    // admin
    // moderator
    // manager
    // chief


    // controller


    // пишу тест
    // controller.logout()
}
