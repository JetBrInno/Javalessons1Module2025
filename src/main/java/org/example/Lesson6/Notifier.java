package org.example.Lesson6;

public interface Notifier {
    void send(String text, EmployeeL6 employee);

    boolean auth(EmployeeL6 employee);
}
