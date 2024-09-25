package com.javaSE.io;

import com.review.programming.progrom.Color_Print_Utils;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 使用 try-with-resources 语句确保资源自动关闭
        try (
                FileReader fileReader = new FileReader("src/com/javaSE/io/Main.java")
        ) {


        } catch (IOException e) {
            Color_Print_Utils.getInstance().printlnYellow("产生运行时异常: " + e.getMessage());
        } finally {
            Color_Print_Utils.getInstance().programEnd();
            Color_Print_Utils.getInstance().printlnGreen("文件已关闭");
        }
    }
}
