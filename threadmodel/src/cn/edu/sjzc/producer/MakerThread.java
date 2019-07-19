/**
 * FileName: MakerThread
 * Author:   贾子健
 * Date:     2019/5/19 15:14
 */
package cn.edu.sjzc.producer;

import java.util.Random;

public class MakerThread extends Thread {
    private final Random random;
    private final Table table;
    private static int id = 0; //蛋糕流水号,公用

    public MakerThread(String name, Table table, long seed) {
        super(name);
        this.random = new Random(seed);
        this.table = table;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                String cake = "[Cake NO."+nextId()+" by "+getName()+"]";
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized int nextId() {
        return id++;
    }

}
