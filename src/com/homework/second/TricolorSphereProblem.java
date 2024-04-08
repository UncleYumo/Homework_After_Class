//package second.homework.chapter2to3;
//import java.util.*;
//
//class RandomNum {
//    int range = 12;// 记录数组的范围 0 - 12
//    int count = 8;// 需要生成的随机数个数 8
//
//    int[] getRandomInt() {
//
//        Set<Integer>generated = new HashSet<>(); // 使用HashSet来存储不同的随机数
//        List<Integer>uniqueNumbers = new ArrayList<>();// 存储最终结果的列表
//
//        int[] arr = new int[8];
//
//        Random random = new Random();
//
//        while(uniqueNumbers.size() < count) {
//            int randomNumber = random.nextInt(range);
//            if(!(generated.contains(randomNumber))) {
//                uniqueNumbers.add(randomNumber);
//                generated.add(randomNumber);
//            }
//            for(int i = 0;i < arr.length;i++) {
//                arr[i] = uniqueNumbers.get(i);
//            }
//        }
//
//        return arr;
//    }
//}
//
////3. 编程实现三色球问题。若一个口袋中放12个球，其中3个红色的，3个白色的和6个黑色的。从中任取8个球，问共有种不同颜色搭配？
//public class TricolorSphereProblem {
//    public static void main(String[] args) {
//
//        //String[] totalArray = new int[] {"r1","r2","r3","w1","w2","w3",
//                                            //"b1","b2","b3","b4","b5","b6"};
//
//        RandomNum rand = new RandomNum();
//        int[][] warehouseArray = new int[][]{};
//        int[] tempArray = new int[8];
//        boolean isFlag = true;
//        //int rankCount = 0;
//
//        for(int i = 0;i < 10;i++) {
//
//            //tempArray = rand.getRandomInt();
//
//            System.out.println(Arrays.toString(rand.getRandomInt()));
//
//        }
//    }
//}

//package second.homework.chapter2to3;
//import org.w3c.dom.ls.LSException;
//
//import java.util.*;
//
//public class TricolorSphereProblem {
//    public static void main(String[] args) {
//
//        Random random = new Random();
//        //int[][] warehouseArray= new int[][]{};
//
//        int redNum = 0;
//        int whiteNum = 0;
//        int blackNum = 0;
//
//        List<List<Integer>> warehouseList = new ArrayList<>();
//
//        int count = 0;
//
//        for (int i = 0;i < 50000;i++) {
//
//            redNum = random.nextInt(4);
//            whiteNum = random.nextInt(4);
//            blackNum = random.nextInt(7);
//            List<Integer> uniqueArray = new ArrayList<>();
//            int sum = redNum + whiteNum + blackNum;
//
//            uniqueArray.add(redNum);
//            uniqueArray.add(whiteNum);
//            uniqueArray.add(blackNum);
//
//
//            boolean isFlag = false;
//
//            //System.out.println("Red : " + redNum + " White : " + whiteNum +  " Black : " + blackNum);
//
//            for (List<Integer> existing : warehouseList) {
//                isFlag = (!(existing.equals(uniqueArray))) && (sum == 8);
//            }
//                if(isFlag) {
//                    warehouseList.add(uniqueArray);
//                    System.out.println("Red : " + redNum + " White : " + whiteNum +  " Black : " + blackNum);
//                    count++;
//                }
//
//            }
//
//        System.out.println("共有" + count + "种组合");
//
//        }
//
//
//    }
package com.homework.second;

public class TricolorSphereProblem {
    public static void main(String[] args) {


        int redNum;
        int whiteNum;
        int blackNum;
        int count = 0;

        for(int i = 0;i <= 3;i++ ) {
            for(int j = 0;j <= 3;j++) {
                for(int k = 0;k <= 6;k++) {
                    if((i + j + k) == 8) {
                        count++;
                    }
                }
            }
        }
        System.out.println("共有" + count + "种不同的颜色搭配");


    }
}