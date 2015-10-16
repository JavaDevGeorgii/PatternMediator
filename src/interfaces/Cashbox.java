package interfaces;

import impl.Message;

/**
 * Created by GEO on 14.10.15.
 */
public interface Cashbox {

    Object getMessage();
    void processMessage(Message message);
}
