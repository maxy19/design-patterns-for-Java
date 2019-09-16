package com.mxy.design.observer.event.driver;

import java.util.ArrayList;
import java.util.List;

public class EventSource {

    public static List<ObServerListener> listeners = new ArrayList<>();

    public void addListener(ObServerListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ObServerListener listener) {
        listeners.remove(listener);
    }

    public void notifies(String key,WeChatUser user){
        listeners.forEach(listener -> {
            listener.handleEvent(new WeChatOfficialAccount(key,user));
        });
    }

}
