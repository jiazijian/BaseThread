/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/5/19 15:19
 */
package cn.edu.sjzc.producer;

public class Main {
    public static void main(String[] args){
        Table table = new Table(3);
        new MakerThread("MakerThread-1",table,31415).start();
        new MakerThread("MakerThread-2",table,92653).start();
        new MakerThread("MakerThread-3",table,58979).start();
        new EaterThread("EaterThread-1",32384,table).start();
        new EaterThread("EaterThread-1",62643,table).start();
        new EaterThread("EaterThread-1",38327,table).start();
    }
}
