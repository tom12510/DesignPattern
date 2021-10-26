package org.example.Proxy;

import org.example.Proxy.Subject;

import java.time.LocalDateTime;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("基于接口的代理"+LocalDateTime.now());
    }
}
