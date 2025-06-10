package org.example.Lesson12.GenericExample;

import org.example.Lesson3.User;
import org.example.Lesson6.EmailNotifier;
import org.example.Lesson9.BannedUser;

public class JustClass {

    public static void main(String[] args) {
        HttpResponse<BannedUser> bannedUserResponse = new HttpResponse<>(200, new BannedUser());
        System.out.println(bannedUserResponse.getCode());
        System.out.println(bannedUserResponse.getBody());


        HttpResponse<EmailNotifier> notifierResponse2 = new HttpResponse<>(200, new EmailNotifier());
        System.out.println(notifierResponse2.getCode());
        System.out.println(notifierResponse2.getBody());

        HttpResponse<User> notifierResponse3 = new HttpResponse<>(200, new User("afsa", "fasfa",15, "94252", "fafasf"));
        System.out.println(notifierResponse3.getCode());
        System.out.println(notifierResponse3.getBody());
    }
}
