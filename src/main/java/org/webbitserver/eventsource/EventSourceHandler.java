package org.webbitserver.eventsource;

public interface EventSourceHandler {
    void onConnect();
    void onMessage(MessageEvent event);
    void onDisconnect();
    void onError(Throwable t);
}