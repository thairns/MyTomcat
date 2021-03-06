package impl;

//subject
public interface Lifecycle {
    void addLifecycleListener(LifecycleListener listener);
    void removeLifecycleListener(LifecycleListener listener);
    LifecycleListener[] findLifecycleListeners();
    void setState(String type,Object o);
}
