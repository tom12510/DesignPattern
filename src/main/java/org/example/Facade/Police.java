package org.example.Facade;

public class Police {
    public void checkLetter(ILetterProcess letterProcess){
        System.out.println(letterProcess+"信件已经检查过了...");
    }
}
