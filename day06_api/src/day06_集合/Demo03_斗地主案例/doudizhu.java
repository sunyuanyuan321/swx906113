package day06_集合.Demo03_斗地主案例;

import java.util.ArrayList;
import java.util.Collections;

public class doudizhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        //for循环查看
//        for (String color : colors) {
//            System.out.println(color);
//        }
        String[] numbers = {"2", "1", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("大王");
        poker.add("小王");

        for (String color : colors) {
            for (String number : numbers) {
                //System.out.println(color+number);
                poker.add(color + number);
            }
        }
        System.out.println(poker);

        //2、洗牌
        Collections.shuffle(poker);
        System.out.println(poker);

        //3、发牌
        ArrayList<String> plays01 = new ArrayList<>();
        ArrayList<String> plays02 = new ArrayList<>();
        ArrayList<String> plays03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                dipai.add(p);
            } else if (i % 3 == 0) {
                plays01.add(p);
            } else if (i % 3 == 1) {
                plays02.add(p);
            } else if (i % 3 == 2) {
                plays03.add(p);
            }
        }
        //4、看牌
        System.out.println("玩家1" + plays01);
        System.out.println("玩家2" + plays02);
        System.out.println("玩家3" + plays03);
        System.out.println("底牌" + dipai);
    }
}
