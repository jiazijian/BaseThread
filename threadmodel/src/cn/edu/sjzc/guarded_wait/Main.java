/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/5/17 16:14
 */
package cn.edu.sjzc.guarded_wait;

public class Main {
    public static void main(String[] args){
         RequestQueue requestQueue = new RequestQueue();
         new ClientThread(3141592L,"AAA",requestQueue).start();
         new ServerThread("BBB",requestQueue,6535897L).start();
    }
}
