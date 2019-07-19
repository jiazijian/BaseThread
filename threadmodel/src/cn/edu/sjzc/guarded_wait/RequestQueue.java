/**
 * FileName: RequestQueue
 * Author:   贾子健
 * Date:     2019/5/17 15:40
 */
package cn.edu.sjzc.guarded_wait;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();

    public synchronized  Request getRequest() {
        //守护条件； queue.peek()存在元素则返回头元素，不存在返回null
        while (queue.peek() == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        //移除第一个元素并返回
        return queue.remove();
    }

    public  synchronized void putRequest(Request request){
        queue.offer(request);
        notifyAll();
    }


}
