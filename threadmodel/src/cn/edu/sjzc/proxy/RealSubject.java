package cn.edu.sjzc.proxy;

/**
 * 定义真实角色
 */
public class RealSubject implements Subject {

@Override
public void Request() {

System.out.println("RealSubject");

    }

}