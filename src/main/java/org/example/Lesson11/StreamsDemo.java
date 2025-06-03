package org.example.Lesson11;

import java.util.HashMap;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> players = new HashMap<>();
        players.put("Alex",100);
        players.put("Joe",55);
        players.put("Sam",23);
        players.put("Michael",223);
        players.put("Daryl",58);

       // System.out.println(players);
      //  System.out.println(players.keySet());
        System.out.println(players.values());

        //Stream<Integer> stream = players.values().stream();
        //System.out.println(stream);
       // System.out.println(stream.toList());
       // System.out.println(players.values().stream().sorted().toList());
        System.out.println(players.values().stream().sorted().filter(point -> point > 50).map(point -> point + 100).toList());
    }
}
