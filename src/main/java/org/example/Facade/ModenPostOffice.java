package org.example.Facade;

/**
 *  Facade 门面角色  代替子系统执行任务
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();

    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        letterPolice.checkLetter(letterProcess);
        letterProcess.sendLetter();
    }
}
