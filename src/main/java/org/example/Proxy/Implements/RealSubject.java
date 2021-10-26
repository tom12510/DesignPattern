package org.example.Proxy.Implements;

import org.example.Proxy.Inerface.Subject;

import java.time.LocalDateTime;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("基于接口的代理"+LocalDateTime.now());
    }
}
