package org.example.Segregate;

public class domain {
    public static void main(String[] args) {

        A a = new A();
        a.depend1(new B());
        a.depend2(new B());


        C c = new C();

        c.depend3(new D());

        c.depend4(new D());
    }
}
