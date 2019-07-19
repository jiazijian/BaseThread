/**
 * FileName: Main
 * Author:   贾子健
 * Date:     2019/4/12 20:39
 */
package cn.edu.sjzc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){
        final  List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        new WriteListThread(list).start();
        new ReadListThread(list).start();

    }

}
