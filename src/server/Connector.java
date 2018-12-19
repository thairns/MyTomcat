package server;

import impl.Valve;

public class Connector extends LifecycleBase{
    private Valve basic = null;

    @Override
    protected void startInternal() {
    }

    @Override
    protected void stopInternal() {
    }

    @Override
    protected void destroyInternal() {
    }

    public Request createRequest(){
        Request request = new Request();
        return request;
    }

    public Valve getValve(){
        return basic;
    }
}
