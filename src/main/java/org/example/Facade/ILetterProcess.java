package org.example.Facade;

/**
 * 子系统
 */
public interface ILetterProcess {
    void writeContext(String content);
    void fillEnvelope(String address);
    void letterInotoEnvelope();
    void sendLetter();
}
