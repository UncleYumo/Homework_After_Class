package com.homework.fourth;

/**
* 一、编程题
* 1. 继承的使用：（a）编写Student类，包括学生的学号no，姓名name和专业三个基本属性，并定义构造方法和其他成员方法；
* （b）定义本科生类（UnderGraduate）要求：
* (1) 继承学生类;
* (2) 定义本科生类的构造方法；
* (3) 增加一个本学期所选课程信息属性。
* (4) 定义本科生类的其他方法。
* 最后定义测试类测试。
* 2.设计一个商品类，字段包括商品名称、重量、价格、配件数量、配件制造厂商。
*   要求：有构造函数,根据需要定义成员方法。 重写：toString方法；  重写：equals方法，进行两件商品的比较。最后定义测试类进行测试。
 */
public class Product {
    private String productName;
    private double weight;
    private double price;
    private double numberOfParts;
    private String accessoryManufacture;

    public Product(String productName, double weight, double price, double numberOfParts, String accessoryManufacture) {
        this.productName = productName;
        this.weight = weight;
        this.price = price;
        this.numberOfParts = numberOfParts;
        this.accessoryManufacture = accessoryManufacture;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNumberOfParts() {
        return numberOfParts;
    }

    public void setNumberOfParts(double numberOfParts) {
        this.numberOfParts = numberOfParts;
    }

    public String getAccessoryManufacture() {
        return accessoryManufacture;
    }

    public void setAccessoryManufacture(String accessoryManufacture) {
        this.accessoryManufacture = accessoryManufacture;
    }
    public String toString() {
        return getProductName() + "(name)-" + getPrice() + "(price)-" + getWeight() + "(weight)-" + getAccessoryManufacture()
                + "(AccessoryManufacture)-" + getNumberOfParts() + "(Number of Parts)-";

    }
    public boolean euqals(Product product) {
        boolean isNameEquals = this.productName.equals(product.getProductName());
        boolean isPriceEquals = this.price == product.getPrice();
        boolean isNumberEquals = this.numberOfParts == product.numberOfParts;
        boolean isManufactureEquals = this.accessoryManufacture.equals(product.accessoryManufacture);
        boolean isWeightEquals = this.weight == product.weight;
        if(isNumberEquals && isPriceEquals && isNumberEquals && isManufactureEquals && isWeightEquals) {
            return true;
        }
        return false;
    }
}