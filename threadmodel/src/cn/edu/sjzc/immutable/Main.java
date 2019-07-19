package cn.edu.sjzc.immutable;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("aaa","bbb");
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();

    }
}
