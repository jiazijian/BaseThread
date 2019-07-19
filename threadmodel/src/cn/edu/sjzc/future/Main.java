package cn.edu.sjzc.future;

/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/7/19 23:21
 */
public class Main {
    public static void main(String[] args){
        System.out.println("main开始");
        Host host = new Host();
        Data data1 = host.request(10, 'A');
        Data data2 = host.request(20, 'B');
        Data data3 = host.request(30, 'C');

        System.out.println("main other 开始");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("data1:--"+data1.getContent());
        System.out.println("data2:--"+data2.getContent());
        System.out.println("data3:--"+data3.getContent());

        System.out.println("main结束");
    }
}
