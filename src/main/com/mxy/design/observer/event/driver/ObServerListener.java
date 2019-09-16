package com.mxy.design.observer.event.driver;

import java.util.EventListener;
import java.util.EventObject;

public interface ObServerListener  extends EventListener {
    /**
     * 接受公众号推送的信息
     */
     void handleEvent(EventObject event);


}
