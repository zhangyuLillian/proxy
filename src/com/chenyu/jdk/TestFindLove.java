package com.chenyu.jdk;

/**
 * @author zhangyu
 * @description
 * @date 2018/12/27 17:17
 */
public class TestFindLove {

    public static void main(String[] args) {
        try {

//			Person obj = (Person)new MeiPo().getInstance(new XiaoLiLi());
//			System.out.println(obj.getClass());
//			obj.findLove();

            //原理：
            //1.拿到被代理对象的引用，然后获取它的接口
            //2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
            //3.把被代理对象的引用也拿到了
            //4.重新动态生成一个class字节码
            //5.然后编译

            //获取字节码内容
//			byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
//			FileOutputStream os = new FileOutputStream("E:/WORKSPACE/$Proxy0.class");
//			os.write(data);
//			os.close();

            //是什么?
            //为什么？
            //怎么做？

            Person obj = (Person)new MeiPo().getInstance(new XiaoLiLi());
            System.out.println(obj.getClass());
            obj.findLove();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
