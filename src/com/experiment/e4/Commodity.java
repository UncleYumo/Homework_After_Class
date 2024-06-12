package com.experiment.e4;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/22
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 设计一个商品类，字段包括商品名称、重量、价格、配件数量、配件制造厂商。
 * 要求：要定义构造函数，重写：toString方法；重写：equals方法，进行两件商品的比较。
 */
public class Commodity {
    private String name;
    private double weight;
    private double price;
    private double numberOfParts;
    private String accessoryManufacture;

    public Commodity(String name, double weight, double price, double numberOfParts, String accessoryManufacture) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.numberOfParts = numberOfParts;
        this.accessoryManufacture = accessoryManufacture;
    }

    @Override
    public boolean equals(Object obj) {
        Commodity temp = (Commodity)obj;
        return name.equals(temp.name) && weight == temp.weight && price == temp.price &&
                numberOfParts == temp.numberOfParts && accessoryManufacture.equals(temp.accessoryManufacture);
    }
    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", numberOfParts=" + numberOfParts +
                ", accessoryManufacture='" + accessoryManufacture + '\'' +
                '}';
    }
}
