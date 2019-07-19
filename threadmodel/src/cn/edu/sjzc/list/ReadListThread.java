/**
 * FileName: ReadListThread
 * Author:   贾子健
 * Date:     2019/4/12 20:45
 */
package cn.edu.sjzc.list;

import java.util.List;

public class ReadListThread extends Thread {

    private final List<Integer> list;

    public ReadListThread(List<Integer> list) {
        super("ReadListThread");
        this.list = list;
    }

    @Override
    public void run() {
        while (true) synchronized (this) {
            for (Integer i : list) {
                System.out.println(i);

            }
        }
    }
}
