/**
 * FileName: Person
 * Author:   贾子健
 * Date:     2019/4/12 16:54
 */
package cn.edu.sjzc.immutable;


public final  class Person {
    private final   String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }



    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
