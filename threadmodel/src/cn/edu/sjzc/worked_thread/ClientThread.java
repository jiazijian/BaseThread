/**
 * FileName: ClientThread
 * Author:   贾子健
 * Date:     2019/5/30 21:38
 */
package cn.edu.sjzc.worked_thread;

import java.util.Random;

public class ClientThread extends Thread{
    private final Channel channel;
    private static final Random random = new Random();

    public ClientThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        for (int i = 0; true ; i++) {
            Request request = new Request(getName(),i);
            channel.putRequest(request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
