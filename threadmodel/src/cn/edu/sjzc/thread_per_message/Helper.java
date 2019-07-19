/**
 * FileName: Helper
 * Author:   贾子健
 * Date:     2019/5/29 19:51
 */
package cn.edu.sjzc.thread_per_message;

public class Helper {
    public void handle(int count, char c){
        System.out.println("       handle("+count+","+c+")BEGIN)");
        for (int i = 0; i < count; i++) {
            slowly();
            System.out.println(c);
        }
        System.out.println("");
        System.out.println("       handle("+count+","+c+")END)");
    }

    private void slowly() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
