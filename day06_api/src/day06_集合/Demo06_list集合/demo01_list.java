package day06_集合.Demo06_list集合;

import java.util.ArrayList;
import java.util.List;

public class demo01_list {
    public static void main(String[] args) {
        List<String> list01=new ArrayList<>();
        list01.add("a");
        list01.add("b");
        list01.add("c");
        list01.add("b");
        System.out.println(list01);

        list01.add(1,"f");
        System.out.println(list01);

        list01.remove(1);
        System.out.println(list01);

        //替换
        list01.set(1,"u");
        System.out.println(list01);
    }
}
