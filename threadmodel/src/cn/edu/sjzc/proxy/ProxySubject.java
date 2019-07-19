/**
 * FileName: ProxySubject
 * Author:   贾子健
 * Date:     2019/4/17 21:53
 */
package cn.edu.sjzc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxySubject implements InvocationHandler {

    private Object object;

    public ProxySubject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method:"+ method + ",Args:" + args);

        method.invoke(object, args);
        return null;
    }
}
