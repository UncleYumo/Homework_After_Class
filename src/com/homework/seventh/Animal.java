package com.homework.seventh;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/20
 * @School 无锡学院
 * @StudentID 22344131
 * @Description 动物的接口，拥有cry()和getAnimalName()两个公有的抽象方法
 */
public interface Animal {
    /**
     * @Description 触发动物哭泣动作
     */
    abstract public void cry();

    /**
     * @return 返回动物的名字
     */
    abstract public String getAnimalName();
}
