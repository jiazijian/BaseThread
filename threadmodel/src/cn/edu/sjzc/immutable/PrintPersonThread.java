/**
 * FileName: PrintPersonThread
 * Author:   贾子健
 * Date:     2019/4/12 17:03
 */
package cn.edu.sjzc.immutable;

public class PrintPersonThread extends Thread{

    private Person person;

    public PrintPersonThread( Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"print"+person);
        }
    }
}
