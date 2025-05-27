package org.example.Lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Examples {

    public static void main(String[] args) throws IOException {

      //  String pass = new Scanner(System.in).nextLine();

        Path filePath = Path.of("test.txt");

//        Files.writeString(filePath, "\n", StandardOpenOption.CREATE_NEW);
//        Files.writeString(filePath, pass, StandardOpenOption.APPEND);

        String s = Files.readString(filePath);
        System.out.println(s);



        if (Files.exists(filePath)) {
            System.out.println("Файл существует");
        }

        System.out.println(Files.isWritable(filePath));
    }
}
