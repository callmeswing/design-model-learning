package com.swingdai.template_method;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  模板方法 - 行为型
 *      意图：
 *      定义算法框架，其中一些步骤的实现延迟到子类
 *      通过模板方法，子类可自定义算法的某些步骤，但无需改变算法的结构
 *
 *      实例：
 *      冲咖啡、沏茶 可抽象出近似的步骤与流程
 *      抽象模板类(咖啡因饮品)定义执行流程，并实现其中一些相同的流程(无需改变)
 *      子类按需实现其不同的流程 调用父类定义的算法执行整个流程
 *
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("boil water...");
    }

    void pourInCup(){
        System.out.println("pour in cup...");
    }
}
