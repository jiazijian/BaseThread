/**
 * FileName: ServerThread
 * Author:   贾子健
 * Date:     2019/5/17 16:08
 */
package cn.edu.sjzc.guarded_wait;

import java.util.Random;

public class ServerThread extends Thread{
    private final Random random;
    private  final RequestQueue requestQueue;

    public ServerThread(String name, RequestQueue requestQueue,long seed) {
        super(name);
        this.random = new Random(seed);
        this.requestQueue = requestQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            Request request = requestQueue.getRequest();
            System.out.println(Thread.currentThread().getName()+"handles"+request);

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
