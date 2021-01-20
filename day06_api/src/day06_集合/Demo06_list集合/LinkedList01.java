package day06_集合.Demo06_list集合;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("b");

        linked.addFirst("www.");
        linked.push("http");
        linked.addLast(".com");
        linked.add("cn");
        System.out.println(linked);
    }
}
