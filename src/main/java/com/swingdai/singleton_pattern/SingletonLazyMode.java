package com.swingdai.singleton_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 *
 *  懒汉模式 <线程安全实现较为复杂>
 *      按需延迟实例化
 *          适合单例对象内存占用大、操作时间长 & 要求启动速度快
 *      volatile问题
 *          实际上仅在懒汉模式(双重校验中)需要
 *          回顾对象实例化步骤：
 *              1.创建内存空间
 *              2.初始化对象
 *              3.将内存地址赋值给引用
 *          重排序可能导致上述步骤按照132执行 会导致线程拿到的对象是不完整的
 *          具体：
 *              如果不加 volatile，那么线程 A 在执行到上述代码的第 2 处时就可能会执行指令重排序，
 *              将原本是 1、2、3 的执行顺序，重排为 1、3、2。特殊情况下，线程 1 在执行完第 3 步之后，
 *              如果来了线程 B 执行到上述代码的第 1 处，判断 instance 对象已经不为 null，但此时线程 A
 *              还未将对象实例化完，那么线程 2 将会得到一个被实例化“一半”的对象，从而导致程序执行出错，这就
 *              是为什么要给私有变量添加 volatile 的原因！！
 *
 *
 *  ① 不加锁
 *      线程不安全 存在多次实例化可能
 *  ② 加锁整个方法
 *      线程安全 但不必要的同步开销过多
 *  ③ 双重校验 仅加锁实例化部分 需要volatile修饰
 *      线程安全 实现相对复杂一丢丢
 */
public class SingletonLazyMode {

    /** 切记 懒汉模式需要volatile 因为指令重排序的问题**/
    private static volatile SingletonLazyMode instance;

    private SingletonLazyMode() {
    }

    /** 不加锁 线程不安全 **/
    public static SingletonLazyMode getInstance() {
        if (instance == null) {
            instance = new SingletonLazyMode();
        }
        return instance;
    }

    /** 加锁整个方法 线程安全 **/
    public static synchronized SingletonLazyMode getInstanceSync() {
        if (instance == null) {
            instance = new SingletonLazyMode();
        }
        return instance;
    }

    /** 双重校验 仅加锁实例化部分 线程安全 **/
    public static SingletonLazyMode getInstanceDoubleCheck() {
        if (instance == null) { // 1
            synchronized (SingletonLazyMode.class) {
                if (instance == null) {
                    instance = new SingletonLazyMode(); // 2
                }
            }
        }
        return instance;
    }
}
