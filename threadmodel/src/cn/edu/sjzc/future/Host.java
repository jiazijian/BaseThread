package cn.edu.sjzc.future;

/**
 * FileName: Host
 * Author:   贾子健
 * Date:     2019/7/19 23:17
 */
public class Host {
    public Data request(final int count,final char c){

        final FutureData futureData = new FutureData();
        System.out.println("请求开始");
        new Thread(){
            @Override
            public void run() {
                RealData realData = new RealData(count,c);
                futureData.setRealData(realData);
            }
        }.start();
        System.out.println("请求END");
        return futureData;
    }
}
