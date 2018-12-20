package observer;

import impl.Container;
import template.LifecycleBase;

public abstract class ContainerBase extends LifecycleBase implements Container {
    protected Container child = null;
    public void addChild(Container child){
        this.child = child;
    }
}
