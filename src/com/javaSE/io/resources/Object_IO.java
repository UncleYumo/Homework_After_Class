package com.javaSE.io.resources;

import com.review.programming.progrom.Color_Print_Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author uncle_yumo
 * @CreateDate 2024/9/26
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Object_IO {
    public static void main(String[] args) {
//        try (
//                ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(
//                        "src/com/javaSE/io/resources/io_object.txt"
//                ))
//        ) {
//            ObjectDemo objectDemo = new ObjectDemo(1);
//            objectDemo.stringList.add("Hello");
//            objectDemo.stringList.add("World");
//
//            stream.writeObject(objectDemo);
//
//        } catch (Exception e) {
//            Color_Print_Utils.getInstance().printlnYellow(e.getMessage());
//
//        }

        try (
                ObjectInputStream stream = new ObjectInputStream(
                        new FileInputStream(
                                "src/com/javaSE/io/resources/io_object.txt"
                        )
                )
        ) {
            Object object = stream.readObject();
            ObjectDemo objectDemo = (ObjectDemo) object;
            Color_Print_Utils.getInstance().printlnGreen(objectDemo.toString());

        } catch (Exception e) {
            Color_Print_Utils.getInstance().printlnYellow(e.getMessage());
        }

    }

    static class ObjectDemo implements java.io.Serializable {
        @Serial
        private static final long serialVersionUID = 1L;  // 序列化版本号
        int id;
        List<String> stringList = new ArrayList<>();

        public ObjectDemo(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "ID | " + id + " | String List | " + stringList.toString();
        }
    }
}
