/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/5/18 16:41
 */
package cn.edu.sjzc.balking;

public class Main {
    public static void main(String[] args){
        Data data = new Data("data.txt","(empty)");

        new ChangerThread("ChangerThread",data).start();
        new  SaverThread("SaverThread",data).start();

    }
}
