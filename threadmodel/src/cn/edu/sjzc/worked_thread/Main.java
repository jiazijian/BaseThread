package cn.edu.sjzc.worked_thread;

/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/7/22 21:08
 */
public class Main {
    public static void main(String[] args){
         Channel channel = new Channel(5);
         channel.startWorkers();
         new ClientThread("Aaa",channel).start();
         new ClientThread("Bbb",channel).start();
         new ClientThread("Ccc",channel).start();

    }
}
