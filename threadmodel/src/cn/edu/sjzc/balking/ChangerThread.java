/**
 * FileName: ChangerThread
 * Author:   贾子健
 * Date:     2019/5/18 16:14
 * 用于修改数据内容，并执行保存处理
 */
package cn.edu.sjzc.balking;

import java.io.IOException;
import java.util.Random;

public class ChangerThread extends Thread{
    private final Data data;
    private final Random random = new Random();

    public ChangerThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; true; i++) {
                data.change("NO." + i); //修改数据
                Thread.sleep(random.nextInt(1000)); //执行其他操作
                data.save(); //显示保存
                 }
            } catch(InterruptedException e){
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }

        }
    }

