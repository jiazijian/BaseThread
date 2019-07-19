/**
 * FileName: Table
 * Author:   贾子健
 * Date:     2019/5/19 14:52
 * 放蛋糕的桌子
 */
package cn.edu.sjzc.producer;

public class Table {
    private final String[] buffer;  //蛋糕实际放的位置
    private int tail;  //put拿的位置
    private int head;  //take取得位置
    private int count; //数量

    public Table(int count) {
        this.buffer = new String[count];
        this.tail = 0;
        this.head = 0;
        this.count = 0;
    }

    //放置蛋糕
    public synchronized void put(String cake) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"put"+cake);
        while (count>=buffer.length){
            wait();
        }
        buffer[tail] = cake;
        tail = (tail+1)%buffer.length;
        count++;
        notifyAll();
    }
    //取蛋糕
    public synchronized String take() throws InterruptedException {
        while (count<=0){
            wait();
        }
        head = (head+1)%buffer.length;
        count--;
        notifyAll();
        System.out.println(Thread.currentThread().getName()+"take"+buffer[head]);
        return buffer[head];
    }

}
