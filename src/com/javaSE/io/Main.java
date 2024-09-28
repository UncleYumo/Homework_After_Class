package com.javaSE.io;

import com.review.programming.progrom.Color_Print_Utils;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 使用 try-with-resources 语句确保资源自动关闭
        try (
                FileReader fileReader = new FileReader(
                        "src/com/javaSE/io/io_test01.txt"
                );
                FileWriter fileWriter = new FileWriter(
                        "src/com/javaSE/io/io_copy.txt"
                )
//                FileWriter fileWriter = new FileWriter("src/com/javaSE/io/io_test01.txt", true)
        ) {
            char[] buffer = new char[3];
            int len;
            while ((len = fileReader.read(buffer))!= -1) {
                fileWriter.write(buffer, 0, len);
                fileWriter.flush();
                Color_Print_Utils.getInstance().printlnGreen("写入成功 | " + new String(buffer));

            }

        } catch (IOException e) {
            Color_Print_Utils.getInstance().printlnYellow("产生运行时异常: " + e.getMessage());

        } finally {
            Color_Print_Utils.getInstance().programEnd();
            Color_Print_Utils.getInstance().printlnGreen("文件已关闭");

        }
    }
}
