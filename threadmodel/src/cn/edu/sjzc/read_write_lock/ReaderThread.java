/**
 * FileName: ReaderThread
 * Author:   贾子健
 * Date:     2019/5/28 19:58
 */
package cn.edu.sjzc.read_write_lock;

public  class ReaderThread extends Thread{
    private final Data data;

    public ReaderThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
        while (true) {
            char[] readbuf = data.read();
            System.out.println(Thread.currentThread().getName()
                    +"reads"+String.valueOf(readbuf));
                  }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
