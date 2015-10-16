package impl;

import java.util.Date;

/**
 * Created by GEO on 14.10.15.
 */
public class Message {

    private String message;
    private Date timeSending;

    public Message() {
    }

    public Message createMessage(Integer counter){
        Message m=new Message();
        m.setMessage(" --send #"+counter+" message --");
        m.setTimeSending(new Date());
        return m;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeSending() {
        return timeSending;
    }

    public void setTimeSending(Date timeSending) {
        this.timeSending = timeSending;
    }
}
