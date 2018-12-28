package com.chenyu.jdk;

/**
 * @author zhangyu
 * @description
 * @date 2018/12/27 17:15
 */
public class XiaoLiLi  implements Person{

    @Override
    public void findLove() {
        System.out.println("又高又帅又靠谱");
    }

    //回顾一下，满足代理模式应用场景的三个必要条件，穷取法
    //1、两个角色：执行者、被代理对象
    //2、注重过程，必须要做，被代理对象没时间做或者不想做（怕羞羞），不专业
    //3、执行者必须拿到被代理对象的个人资料（执行者持有被代理对象的引用）
}
