/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/4/17 21:56
 */
package cn.edu.sjzc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();

        InvocationHandler handler = new ProxySubject(realSubject);

        Class<?> classType = handler.getClass();
        Subject sub = (Subject) Proxy.newProxyInstance(classType.getClassLoader(),
                realSubject.getClass().getInterfaces(), handler);
        System.out.println(sub.getClass());

        sub.Request();
    }
}
