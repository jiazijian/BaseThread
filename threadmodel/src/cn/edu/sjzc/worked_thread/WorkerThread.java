/**
 * FileName: WorkerThread
 * Author:   贾子健
 * Date:     2019/5/30 21:38
 */
package cn.edu.sjzc.worked_thread;

public class WorkerThread extends Thread{
    private  final  Channel channel;

    public WorkerThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        while (true){
            Request request = channel.takeRequest();
            request.excute();
        }
    }
}
