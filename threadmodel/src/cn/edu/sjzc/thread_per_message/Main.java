/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/5/29 19:51
 */
package cn.edu.sjzc.thread_per_message;

public class Main {
    public static void main(String[] args){
        System.out.println("main    BEGIN");
        Host host = new Host();
        host.request(10,'A');//显示10次字符A
        host.request(20,'B');
        host.request(30,'C');
    }
}
