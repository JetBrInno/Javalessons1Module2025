package org.example.Lesson9;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Site {
    public static void main(String[] args) throws IOException {

        // ЗАПИСЬ В ФАЙЛ
        BannedUser user1 = new BannedUser("Михаил","Немишкин", 20, "+795430534534", 1432.532);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("banneduser.json"), user1);


        // ЗАПИСЬ НЕСКОЛЬКИХ ОБЪЕКТОВ В ФАЙЛ
//        BannedUser user1 = new BannedUser("Михаил","Немишкин", 20, "+795430534534", 1432.532);
//        BannedUser user2 = new BannedUser("Игорь","Немишкин", 20, "+795430534534", 1432.532);
//        BannedUser user3 = new BannedUser("Алексей","Немишкин", 20, "+795430534534", 1432.532);
//
//        List<BannedUser> bannedUsers = List.of(user1, user2, user3);
//      //  List<Integer> numbers = List.of(1,2,3,4,5,6);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.writeValue(new File("banneduser.json"), bannedUsers);


        // СЧИТАТЬ ИЗ ФАЙЛА
         objectMapper = new ObjectMapper();
        BannedUser userFromFile = objectMapper.readValue(new File("banneduser.json"), BannedUser.class);
        System.out.println(userFromFile);
        userFromFile.setSalary(1000);

        System.out.println(userFromFile.age);
        userFromFile.getSalary();
    }
}
