package impl;

import server.LifecycleEvent;

//observer
public interface LifecycleListener {
    void lifecycleEvent(LifecycleEvent event);
}
