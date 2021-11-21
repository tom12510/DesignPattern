package org.example.Builder.Case3;

public class Client {
    public static void main(String[] args) {
        Student build = Student.builder().name("123").age(1).gender(2).build();
        System.out.println(build);
    }
}
