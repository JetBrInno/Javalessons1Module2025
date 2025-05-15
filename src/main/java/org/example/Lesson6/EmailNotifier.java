package org.example.Lesson6;

public class EmailNotifier implements Notifier {

    public void send(String text, EmployeeL6 employee) {
        if (auth(employee)) {
            System.out.println("Добрый день, " + employee.getName());
            System.out.println(text);
        }
    }

    public boolean auth(EmployeeL6 employee) {
        return !employee.getEmail().isEmpty();
    }
}
