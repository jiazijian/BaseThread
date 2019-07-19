/**
 * FileName: Request
 * Author:   贾子健
 * Date:     2019/5/17 15:35
 */
package cn.edu.sjzc.guarded_wait;

public class Request {

    private final String name;

    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
