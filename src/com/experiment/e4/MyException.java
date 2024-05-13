package com.experiment.e4;

import java.io.Serial;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/22
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 自定义一个异常类MyException，处理数组下标越界，
 * 如果下标越界则输出语句：“数组下标不能越界，请检查输入！”
 * 编写一个方法search(int n)，根据数组下标输出相应数据，函数含有一个参数为数组下标值，
 * 数组中存储数据为：2020，11，12，13，30。
 * 如果下标越界则抛出异常MyException。
 * 主方法中输入一个整数，调用search方法输出相应数据，利用try catch捕获异常，并处理。
 */
class MyException extends Exception {

    @Serial
    private static final long serialVersionUID = 22344131L;

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

}
