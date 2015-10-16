package interfaces;

import impl.Message;

/**
 * Created by GEO on 14.10.15.
 */
public interface Mediator {

    //receive message from Queue;
    void receiveMessage(Message message);

    //send Message to Array of Cashboxes;
    Message sendMessage();

    //add new Cashbox;
    void addCashebox (Cashbox cashbox);

    //remove Cashbox;
    void removeCashebox(Cashbox cashbox);

    //generate Message
    void messageGenerate();
}
