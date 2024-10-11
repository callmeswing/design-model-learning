package com.swingdai.singleton_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  单例模式 - 创建型
 *
 *  6种方式：
 *      饿汉式 - 线程安全
 *      懒汉式 - 线程不安全
 *          同步锁 同步整个方法 线程安全
 *          双重校验 改进同步锁 线程安全
 *       枚举类型 - 线程安全
 *       静态内部类 - 线程安全 (简单、安全、按需加载)
 *
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(SingletonEnum.instance.name());
        System.out.println(SingletonEnum.instance.ordinal());
        SingletonEnum.instance.testMethod();
    }
}
