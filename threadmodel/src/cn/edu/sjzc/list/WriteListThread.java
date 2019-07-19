/**
 * FileName: WriteList
 * Author:   贾子健
 * Date:     2019/4/12 20:39
 */
package cn.edu.sjzc.list;

import java.util.List;

public class WriteListThread extends Thread{
    private final List<Integer> list;

    public WriteListThread(List<Integer> list) {
        super("WriteListThread");
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; true ; i++) {
            list.add(i);
            list.remove(0);
        }

    }
}
