package com.homework.sixth;

import java.io.Serial;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/20
 * @School 无锡学院
 * @StudentID 22344131
 * @Description 自定义异常类
 */
public class CustomExceptionClass extends Exception {
    @Serial
    private static final long serialVersionUID = 22344131L;

    public CustomExceptionClass() {
    }

    public CustomExceptionClass(String message) {
        super(message);
    }
}
