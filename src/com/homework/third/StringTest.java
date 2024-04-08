package com.homework.third;

public class StringTest {
    public static void main(String[] args) {

        StringTest stringCat = new StringTest();
        String getSTr = stringCat.concat("-","Fuck","You","All","MotherFucker");
        System.out.println(getSTr);

    }

    public String concat(String operator,String ... strs) {

        String result = "";

        for (int i = 0;i < strs.length;i++) {
            if (i == 0) {
               result += strs[i];
            }else {
                result += (operator + strs[i]);
            }
        }

        return result;

    }
}
