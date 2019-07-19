/**
 * FileName: Data
 * Author:   贾子健
 * Date:     2019/5/18 15:53
 * 表示当前数据
 */
package cn.edu.sjzc.balking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Savepoint;

public class Data {
    private final String fileName;
    private String content;
    private boolean changed; //true表示进行了修改

    public Data(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
        this.changed = true;
    }
    //修改数据内容
    public synchronized void  change(String newContent){
        content = newContent;
        changed = true;
    }
    //如果数据内容修改过，则保存到文件中
    public synchronized  void save() throws IOException{
        if(!changed){
            return;
        }
        doSave();
        changed = false;
    }

    //将数据实际内容保存到文件中
    private synchronized void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName()
                +" calls dosave , content="+content);
        Writer writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}
