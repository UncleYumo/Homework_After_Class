package com.experiment.e1;

/**
 * 打印出所有的“水仙花数”
 * 所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身
 * 例如：153是一个“水仙花数”，因为15^3=1^3+5^3+3^3。
 */
public class NumberOfDaffodils {

    public void getAllNumberOfDaffodils() {
        for (int i = 100; i < 999; i++) {
            if(judegeDaffordils(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public boolean judegeDaffordils(int number) {
        int temp = number;

        int singleDigit = 0;
        int tensDigit = 0;
        int hundredsDigit = 0;


        hundredsDigit = number / 100;
        number = number % 100;

        tensDigit = number / 10;
        number = number % 10;

        singleDigit = number;

        if(Math.pow(hundredsDigit,3) + Math.pow(tensDigit,3) + Math.pow(singleDigit,3) == temp) {
            return true;
        }
        return false;
    }
}
