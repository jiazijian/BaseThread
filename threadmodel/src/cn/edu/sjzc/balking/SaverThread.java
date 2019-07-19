/**
 * FileName: ServerThread
 * Author:   贾子健
 * Date:     2019/5/18 16:05
 * 定期保存数据内容
 */
package cn.edu.sjzc.balking;

import java.io.IOException;

public class SaverThread extends Thread{
    private final Data data;

    public SaverThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
             while (true) {
                 data.save(); //要求保存数据
                 Thread.sleep(1000); //休眠一秒
             }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

