package server;

import impl.Lifecycle;
import impl.LifecycleListener;
//subject
public abstract class LifecycleBase implements Lifecycle{

    private LifecycleSupport lifecycle = new LifecycleSupport(this);

    @Override
    public void addLifecycleListener(LifecycleListener listener) {
        lifecycle.addLifecycleListener(listener);
    }

    @Override
    public void removeLifecycleListener(LifecycleListener listener) {
        lifecycle.removeLifecycleListener(listener);
    }

    @Override
    public LifecycleListener[] findLifecycleListeners() {
        return lifecycle.findLifecycleListeners();
    }

    protected abstract void startInternal();
    protected abstract void stopInternal();
    protected abstract void destroyInternal();
}
