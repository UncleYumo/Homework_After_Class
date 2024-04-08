package com.Assignment.Landlord_Fighting_Game2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    //默认用HashMap 效率最高
    //若想对Map进行排序，通常使用TreeMap
    //牌盒 Map 在下方静态代码块中将使用到此map，因此要添加static关键字
    static HashMap<Integer, String> hm = new HashMap<>();//键: int(序号) 值: String(牌)

    //创建单列几何，存储所有牌的序号
    static ArrayList<Integer> list = new ArrayList<>();

    /*
        {
        01=♦3, 02=♣3, 03=♥3, 04=♠3, 05=♦4, 06=♣4, 07=♥4, 08=♠4, 09=♦5, 10=♣5, 11=♥5, 12=♠5, 13=♦6, 14=♣6, 15=♥6,16=♠6,
        17=♦7, 18=♣7, 19=♥7, 20=♠7, 21=♦8, 22=♣8, 23=♥8, 24=♠8, 25=♦9, 26=♣9, 27=♥9, 28=♠9, 29=♦10, 30=♣10,31=♥10, 32=♠10, 33=♦J, 34=♣J, 35=♥J, 36=♠J, 37=♦Q, 38=♣Q, 39=♥Q, 40=♠Q, 41=♦K, 42=♣K, 43=♥K, 44=♠K, 45=♦A,
        46=♣A, 47=♥A, 48=♠A, 49=♦2, 50=♣2, 51=♥2, 52=♠2, 53=小王, 54=大王
        }
     */

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //序列号，即每张牌的编号
        int serialNumber = 1; //此变量只在静态代码块中有效
        //依次遍历每一个花色
        for (String n : number) {
            //依次遍历每一个数字
            for (String c : color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        list.add(serialNumber);
        hm.put(serialNumber++,"小王");
        list.add(serialNumber);
        hm.put(serialNumber,"大王");

        //System.out.println(hm);

        //System.out.println(list);
    }

    /**
     * 用于展示该玩家或底牌的牌 即看牌
     * @param name 玩家或底牌堆名
     * @param ts 传入对象其对应的牌序
     */
    public void lookPoker(String name,TreeSet<Integer> ts) {
        System.out.print(name + ": ");
        //遍历TreeSet集合并找到Map中每个序号对应的牌，并将其打印
        for (Integer serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
    /**
     * 空参构造，斗地主的主要运行方法调用集中地
     */
    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌 创建四个集合 一个存底牌，三个分别代表三个玩家的牌
        //TreeSet可以排序 当我们将序号存入TreeSet时，集合会按默认方式进行排序（从小到大）
        TreeSet<Integer> lord  = new TreeSet<>();
        TreeSet<Integer> play1 = new TreeSet<>();
        TreeSet<Integer> play2 = new TreeSet<>();
        TreeSet<Integer> play3 = new TreeSet<>();

        for (int i = 0;i < list.size();i++) {
            //System.out.println(i);
            //i: 依次表示集合中每一个索引
            int serialNumber = list.get(i); //此时serialNumber只在本空参构造器中有效

            if(i <= 2) {
                lord.add(serialNumber);
                continue; //跳过本次索引为i的循环，即在前三次循环中，continue后的代码不生效
            }
            if(i % 3 == 0) {
                play1.add(serialNumber);
            }else if (i % 3 == 1) {
                play2.add(serialNumber);
            }else {
                play3.add(serialNumber);
            }

        }
//        System.out.println(lord);
//        System.out.println(play1);
//        System.out.println(play2);
//        System.out.println(play3);
        //看牌

        lookPoker("底牌",lord);
        lookPoker("钢脑壳",play1);
        lookPoker("大帅逼",play2);
        lookPoker("蛋筒",play3);

    }
}
