package org.example.Lesson6;

public class EmployeeL6 {

    private String name;

    private String surname;

    private int age;

    private String email;

    private double salary;

    public EmployeeL6(String name, String surname, int age, String email, double salary) {
        this.name = name;
        this.surname = surname;

        if (age < 100 && age > 12) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
        this.email = email;
        this.salary = salary;
    }

    public void setSalary(double coefficient) {
        if (coefficient > 1.1 && coefficient < 2) {
            salary = salary * coefficient;
        }
        else {
            System.out.println("Вы пытаетесь повысить зарплату на недопустимую сумму");
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Задает имя.
     * Требования (менее 100 символов, не пустое)
     * @param name
     */
    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым");
        }
        else if (name.length() >= 100) {
            System.out.println("Имя должно быть менее 100 символов");
        }
        else {
            this.name = name;
        }
    }
}
