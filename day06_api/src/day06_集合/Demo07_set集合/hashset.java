package day06_集合.Demo07_set集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<String> setlist = new HashSet<>();
        setlist.add("H");
        setlist.add("e");
        setlist.add("l");
        setlist.add("l");
        setlist.add("o");
        System.out.println(setlist);  //[e, H, l, o] 不规则

        //1、遍历，迭代器循环；普通dor循环不行
        Iterator<String> it = setlist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //2、遍历，增强for
        for (String s : setlist) {
            System.out.println(s);
        }

    }

}
