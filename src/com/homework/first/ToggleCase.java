package com.homework.first;
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

        boolean isFlag = true;
        Scanner scan = new Scanner(System.in);

        while(isFlag) {
            System.out.println("Please input an character : ");
            String getThing = scan.next();

            if (getThing.equals("wq:")) {
                isFlag = false;
                System.out.println("Program has exited!");

            } else {

                char input = getThing.charAt(0);
                if (Character.isUpperCase(input)) {
                    char output = Character.toLowerCase(input);
                    System.out.println("The Converted character is : " + output);
                } else {
                    char output = Character.toUpperCase(input);
                    System.out.println("The Converted character is : " + output);
                }
            }

        }
    }
}
