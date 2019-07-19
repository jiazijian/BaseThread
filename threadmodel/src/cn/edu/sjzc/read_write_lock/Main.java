/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/5/28 19:57
 */
package cn.edu.sjzc.read_write_lock;

public class Main {
    public static void main(String[] args){
        Data data = new Data(10);
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();

        new WriterThread(data,"ABCDEFGHIJKLMNOPQRSTUVWXYZ").start();
        new WriterThread(data,"abcdefghijklmnopqrstuvwxyz").start();
    }
}
