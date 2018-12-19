package template;

import impl.Lifecycle;
import impl.LifecycleListener;
import observer.LifecycleSupport;

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

    public abstract void startInternal();
    public abstract void stopInternal();
    public abstract void destroyInternal();
}
