package cn.edu.sjzc.future;

/**
 * FileName: RealData
 * Author:   贾子健
 * Date:     2019/7/19 23:06
 */
public class RealData implements Data{
    private final String content;

    public RealData(int count,char c) {
        System.out.println("开始制作数据");
        char[] buffer =  new char[count];
        for (int i = 0; i < count; i++) {
            buffer[i] = c;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("work success");
        this.content = new String(buffer);
    }

    @Override
    public String getContent() {
        return content;
    }
}
