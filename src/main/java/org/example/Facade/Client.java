package org.example.Facade;

public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("Happy Road No. 666,God Province,Heaven",
                "Hello,It's me,do you know who I am? I'm your old ");
    }
}
