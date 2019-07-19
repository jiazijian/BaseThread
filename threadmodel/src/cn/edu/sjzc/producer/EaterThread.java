/**
 * FileName: EaterThread
 * Author:   贾子健
 * Date:     2019/5/19 15:08
 */
package cn.edu.sjzc.producer;

import java.util.Random;

public class EaterThread extends Thread {
    private final Random random;
    private final Table table;

    public EaterThread(String name, long seed, Table table) {
        super(name);
        this.random = new Random(seed);
        this.table = table;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
