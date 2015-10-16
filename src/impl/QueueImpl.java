package impl;

import interfaces.Queue;

import java.util.LinkedList;

/**
 * Created by GEO on 14.10.15.
 */
public class QueueImpl implements Queue {

    private LinkedList listQueue;

    public QueueImpl() {
        listQueue = new LinkedList();
    }

    @Override
    public Message pop() {
        return (Message) listQueue.pop();
    }

    @Override
    public void push(Message message) {
        listQueue.push(message);
    }
}
