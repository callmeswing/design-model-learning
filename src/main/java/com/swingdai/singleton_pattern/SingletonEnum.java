package com.swingdai.singleton_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 *
 *  枚举实现
 *      据说是最佳实现方式
 *          写法简单
 *          不存在线程问题
 *          不存在反序列化、反射攻击问题
 *      https://cloud.tencent.com/developer/article/1497592
 */
public enum SingletonEnum {
    instance ("111", "222");

    private String name;

    private String code;

    SingletonEnum(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void testMethod() {
        System.out.println(this.name + " testMethod");
    }
}
