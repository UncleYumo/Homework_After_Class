package com.hanshunping._arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/9
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1) {
            System.exit(0);
        }

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100.0);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("Java从入门到放弃", 300);

        books = customizedSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                double condition = (b1.price - b2.price);
                if (condition == 0){return 0;}
                return condition > 0 ? 1 : -1;
            }
        });
        for (int i = 0; i < books.length; i++) {
            System.out.println("序号：" + i + "  " + books[i].toString());
        }

        books = customizedSortByName(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                double condition = -(b1.name.length() - b2.name.length());
                if (condition == 0){return 0;}
                return condition > 0 ? 1 : -1;
            }
        });
        for (int i = 0; i < books.length; i++) {
            System.out.println("序号：" + i + "  " + books[i].toString());
        }
    }

    public static Book[] customizedSort(Book[] books, Comparator comparator) {
        System.out.println(">> Sort By Price");
        Book temp = null;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if(comparator.compare(books[j], books[j+1]) > 0) {
                    temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                }
            }
        }
        return books;
    }

    public static Book[] customizedSortByName(Book[] books, Comparator comparator) {
        System.out.println(">> Sort By Name");
        Book temp = null;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if(comparator.compare(books[j], books[j+1]) > 0) {
                    temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                }
            }
        }
        return books;
    }

}

class Book {
    public String name;
    public double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "书名 " + name + " - 价格：" + price;
    }
}