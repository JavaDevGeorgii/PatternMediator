package impl;

import interfaces.Cashbox;
import interfaces.Mediator;
import interfaces.Queue;

import java.util.ArrayList;
import java.util.List;

//http://www.javaportal.ru/java/articles/Vasya_Kovyryalkin.html
/**
 * Created by GEO on 14.10.15.
 */
public class MediatorImpl implements Mediator {

    private Object notifier;
    public Queue queue;
    private List <Cashbox> cashboxList;
    private Integer orderingMessage;
    private Message messageTemp;
    public GenerateMessage generateMessage;

    public MediatorImpl() {
        super();
        notifier=new Object();
        queue=new QueueImpl();
        cashboxList=new ArrayList<Cashbox>();
        orderingMessage=0;
    }

    public void run(){

    }

    @Override
    public void receiveMessage(Message message) {

    }

    @Override
    public Message sendMessage() {

        return queue.pop();
    }

    @Override
    public void addCashebox(Cashbox cashbox) {

        cashboxList.add(cashbox);
    }

    @Override
    public void removeCashebox(Cashbox cashbox) {

        cashboxList.remove(cashbox);
    }

    @Override
    public void messageGenerate() {

        generateMessage=new GenerateMessage();
        generateMessage.start();
    }
}
