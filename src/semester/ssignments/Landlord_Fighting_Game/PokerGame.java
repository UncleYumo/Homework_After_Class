package semester.ssignments.Landlord_Fighting_Game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 准备牌
 * 需要放在其他方法中，避免创建新实例时重新调用新的构造方法，浪费准备一副新牌的资源
 * 技术栈：静态代码块
 * 特点：随着类的加载而加载，而且只执行一次
 * static {
 * 代码块
 * }
 * -
 * 洗牌
 * -
 * 发牌
 * -
 * 看牌
 * -
 */
public class PokerGame {

    //定义静态集合ArrayList 泛型String 作为牌盒（Card box）
    static ArrayList<String> list = new ArrayList<>();

    //准备牌 使用静态代码块 随着类的加载而加载且只执行一次
    static {
        //"小王","大王"
        //"♦","♣","♥","♠"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            //c依次表示每一种花色
            for (String num : number) {
                //num依次表示每一个数字
                //♦3 -> ♠2
                //将13 * 4 = 52 张牌存入牌盒list中
                list.add(c + num);
            }
        }
        //此时牌盒中52张牌准备完毕
        list.add("小王");
        list.add("大王");
    }

    //看牌

    /**
     *
     * @param name 玩家姓名
     * @param list 该玩家的牌，调取泛型String，名称为list
     */
    public void lookPoker(String name,ArrayList<String> list) { //传入玩家姓名和泛型String，名称为list
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();

        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            //i: index
            String poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
                continue; //当索引为2 即已经添加了3张牌在lord中，跳出当前轮次，并继续循环
            }

            //给三个玩家轮流发牌
            if (i % 3 == 0) {
                play1.add(poker);
            } else if (i % 3 == 1) {
                play2.add(poker);
            } else {
                play3.add(poker);
            }
        }

        //看牌
        lookPoker("底牌",lord);
        lookPoker("刚脑壳",play1);
        lookPoker("大帅比",play2);
        lookPoker("蛋筒",play3);
    }
}
