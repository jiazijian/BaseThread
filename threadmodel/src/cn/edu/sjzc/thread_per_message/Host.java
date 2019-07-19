/**
 * FileName: Host
 * Author:   贾子健
 * Date:     2019/5/29 19:51
 */
package cn.edu.sjzc.thread_per_message;

public class Host {
    private final Helper helper = new Helper();
    //匿名内部类用到方法的参数或局部变量时，这些变量必须声明为final
    public void request(final int count,final char c){
        System.out.println("       request("+count+","+c+")BEGIN)");
        new Thread(){
            @Override
            public void run() {
                helper.handle(count,c);
            }
        }.start();
        System.out.println("       handle("+count+","+c+")END)");
    }
}
