package com.hanshunping.inner_class;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Anonymity_inner_class {
    public static void main(String[] args) {
        Outer_class outer_class = new Outer_class();
        outer_class.method();
    }
}

class Outer_class {
    public void method() {
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };

        tiger.cry();
        System.out.println(tiger.getClass());

    }
}

interface IA {
    void cry();
}

class Tiger implements IA {
    @Override
    public void cry() {
        System.out.println("老虎在哭");
    }
}