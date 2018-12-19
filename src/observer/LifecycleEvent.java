package observer;

import impl.Lifecycle;

import java.util.EventObject;

public final class LifecycleEvent extends EventObject{

    private static final long serialVersionUID = 1L;
    public LifecycleEvent(Lifecycle lifecycle, String type, Object data) {

        super(lifecycle);
        this.type = type;
        this.data = data;
    }

    private Object data = null;

    private String type = null;

    public Object getData() {

        return (this.data);

    }

    public Lifecycle getLifecycle() {

        return (Lifecycle) getSource();

    }
    public String getType() {

        return (this.type);

    }
}
