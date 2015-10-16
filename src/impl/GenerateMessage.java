package impl;

import interfaces.Mediator;
import interfaces.Queue;

import java.util.Random;

/**
 * Created by GEO on 15.10.15.
 */
public class GenerateMessage extends Thread{

    private Message messageTemp;
    private Mediator mediator;
    private Queue queue;
    private Integer orderingMessage;

    GenerateMessage(){

        orderingMessage=0;
    }

    @Override
    public void run() {

        for (int i=0;i<20;i++){
            try {
                Random random=new Random(2000);
                sleep(random.nextInt());

                queue.push(messageTemp.createMessage(orderingMessage++));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
