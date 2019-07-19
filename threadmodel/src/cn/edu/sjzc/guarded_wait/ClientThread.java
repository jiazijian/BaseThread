/**
 * FileName: ClientThread
 * Author:   贾子健
 * Date:     2019/5/17 15:46
 */
package cn.edu.sjzc.guarded_wait;

import java.util.Random;

public class ClientThread extends Thread{
    private final Random random;
    private final RequestQueue requestQueue;

    public ClientThread(long seed, String name,  RequestQueue requestQueue) {
        super(name);
        this.random = new Random(seed);
        this.requestQueue = requestQueue;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Request request = new Request("No."+i);
            System.out.println(Thread.currentThread().getName()+"request"+request);
            requestQueue.putRequest(request);

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
