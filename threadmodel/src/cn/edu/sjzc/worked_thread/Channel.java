/**
 * FileName: Channel
 * Author:   贾子健
 * Date:     2019/5/30 21:39
 */
package cn.edu.sjzc.worked_thread;

public class Channel {
    private static final int MAX_REQUEST = 100;
    private final  Request[] requestQueue;//保存请求的队列
    private int tail; //放入请求
    private  int head; //读取请求
    private int count;//请求总数
    private final WorkerThread[] threadPool;

    public Channel(int threads) {
        this.requestQueue = new Request[MAX_REQUEST];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
        threadPool = new WorkerThread[threads];
        for (int i = 0; i < threadPool.length; i++) {
            threadPool[i] = new WorkerThread("Worker-"+i,this);
        }
    }

    public  Request takerequest() {
        while (count<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Request request = requestQueue[head];
        head = (head+1) % requestQueue.length;
        count--;
        notifyAll();
        return request;
    }
}
