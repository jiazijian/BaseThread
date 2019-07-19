/**
 * FileName: Request
 * Author:   贾子健
 * Date:     2019/5/30 21:32
 */
package cn.edu.sjzc.worked_thread;

import com.sun.javafx.sg.prism.web.NGWebView;

import java.util.Random;

public class Request {
    private final String name;
    private final int number;
    private static final Random RANDOM = new Random();

    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public void excute(){
        System.out.println(Thread.currentThread().getName()+"excute"+this);

        try {
            Thread.sleep(RANDOM.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
