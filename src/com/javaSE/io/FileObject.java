package com.javaSE.io;

import com.review.programming.progrom.Color_Print_Utils;

import java.io.*;

/**
 * @author uncle_yumo
 * @CreateDate 2024/9/26
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class FileObject {
    public static void main(String[] args) {
        copyFileDemo();
    }

    public static void copyFileDemo() {
        File file = new File("src/com/javaSE/io/resources/forest01.mp4");

        try (
                FileInputStream in = new FileInputStream(file);
                FileOutputStream out = new FileOutputStream("src/com/javaSE/io/resources/forest01_copy.mp4")
        ){
            byte[] bytes = new byte[1024 * 1024];
            int len;
            long total = file.length(), sum = 0;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
                sum += len;
                double rate = (double)sum / total  * 100;
                System.out.printf("已复制 %.2f%%%n", rate);

            }

        } catch (IOException e) {
            Color_Print_Utils.getInstance().printlnYellow("Exception | 文件未找到");
            Color_Print_Utils.getInstance().printlnRed(e.getMessage());
        }
    }

    public static void createFileDemo() {
        File file = new File(".");
        String[] list;
        if ((list = file.list()) == null) {
            return;
        }
        for (String s : list
        ) {
            Color_Print_Utils.getInstance().printlnGreen(s);
        }
    }

    /**
     * @author uncle_yumo
     * @CreateDate 2024/9/26
     * @School 无锡学院
     * @StudentID 22344131
     * @Description
     */

    public static class ButterStream {
        public static void main(String[] args) {
            test();
        }

        public static void test() {
            try (
                    BufferedReader buffer = new BufferedReader(
                            new FileReader("src/com/javaSE/io/io_test01.txt")
                    );
            ) {

                buffer.
                        lines()
                        .filter(line -> line.charAt(0) <= 'z' && line.charAt(0) >= 'a')
                        .forEach(System.out::println);

            } catch (Exception e) {
                Color_Print_Utils.getInstance().printlnYellow("Exception: " + e.getMessage());
            }
        }
    }
}
