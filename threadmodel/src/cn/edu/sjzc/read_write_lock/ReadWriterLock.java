/**
 * FileName: ReadWriterLock
 * Author:   贾子健
 * Date:     2019/5/28 19:58
 */
package cn.edu.sjzc.read_write_lock;

public final class ReadWriterLock {
    private int readingReaders = 0; //正在读取线程
    private int waitingWriters = 0; //等待写入线程
    private int writingWriters = 0; //实际正在写入线程数0-1
    private boolean preferWriter = true; //写入优先为true

    public synchronized void readLock() throws InterruptedException{
        while (writingWriters > 0 || (preferWriter && waitingWriters >0)){
            wait();
        }
        readingReaders++;
    }
    public synchronized void readUnlock(){
        readingReaders--;
        preferWriter = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException{
        waitingWriters++;
        try{
            while (readingReaders > 0 || writingWriters >0){
                wait();
            }
        }finally {
            waitingWriters--;
        }
        writingWriters++;
    }

    public synchronized void writeUnlock(){
        writingWriters--;
        preferWriter = false;
        notifyAll();
    }
}
