package interfaces;

import impl.Message;

/**
 * Created by GEO on 14.10.15.
 */
public interface Queue {

    Message pop();
    void push(Message message);

}
