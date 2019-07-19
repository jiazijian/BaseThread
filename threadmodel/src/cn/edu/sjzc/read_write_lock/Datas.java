/**
 * FileName: Datas
 * Author:   贾子健
 * Date:     2019/5/28 21:17
 */
package cn.edu.sjzc.read_write_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Datas {
    private final char[] buffer;
    private final ReadWriteLock lock = new ReentrantReadWriteLock(true /* fair*/);
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public Datas(int size) {
        this.buffer = new char[size];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = '*';
        }
    }
    public char[] read() throws InterruptedException{
        readLock.lock();
        try{
            return doRead();
        }finally {
            readLock.unlock();
        }

    }

    public void write(char c) throws InterruptedException{
        writeLock.lock();
        try{
          doWrite(c);
        }finally {
            writeLock.unlock();
        }

    }

    private void doWrite(char c) {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = c;
            slowly();
        }
    }

    private char[] doRead() {
        char[] newbuf = new char[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            newbuf[i] = buffer[i];
        }
        slowly();
        return newbuf;
    }

    private void slowly() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
