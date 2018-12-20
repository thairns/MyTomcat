package observer;

import impl.Container;

public class StandardEngine extends ContainerBase implements Container {
    @Override
    public void addChild(Container child) {
        this.child = child;
    }

    @Override
    public void startInternal() {
        StandardEngineConfig config = new StandardEngineConfig();
        addLifecycleListener(config);

        setState("start","StandardEngine");
        System.out.println("StandardEngine Start");
    }

    @Override
    public void stopInternal() {


    }

    @Override
    public void destroyInternal() {

    }
}
