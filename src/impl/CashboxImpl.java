package impl;

import interfaces.Cashbox;
import interfaces.Mediator;

/**
 * Created by GEO on 14.10.15.
 */
public class CashboxImpl implements Cashbox {

    private Integer casheboxNumber;
    private Object notifier;
    public Mediator mediator;

    public void run() {

        try {


            while (true) {
                Message message;
                while ((message = getMessage()) != null) {
                    processMessage(message);
                }
                synchronized (notifier) {
                    notifier.wait(2000);
                }
            }
        }catch (InterruptedException e){

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            this.mediator.removeCashebox(this);
        }
    }

    public CashboxImpl(Mediator mediator) {

        super();
        notifier = new Object();
        this.mediator = mediator;
        this.mediator.addCashebox(this);

    }

    @Override
    public Message getMessage() {
        return null;
    }

    @Override
    public void processMessage(Message mes) {
        System.out.println("Cashebox # " + this.getCasheboxNumber() + " receive a message: " + mes.getMessage() + " at: " + mes.getTimeSending());
    }

    public Integer getCasheboxNumber() {
        return casheboxNumber;
    }

    public void setCasheboxNumber(Integer casheboxNumber) {
        this.casheboxNumber = casheboxNumber;
    }

    public Object getNotifier() {
        return notifier;
    }

    public void setNotifier(Object notifier) {
        this.notifier = notifier;
    }
}
