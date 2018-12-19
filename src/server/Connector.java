package server;

import impl.Valve;

public class Connector extends LifecycleBase{
    private Valve basic = null;

    @Override
    protected void startInternal() {
        System.out.println("Connector Start");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Connector Stop");
    }

    @Override
    protected void destroyInternal() {
        System.out.println("Connector Destory");
    }

    public Request createRequest(){
        Request request = new Request();
        return request;
    }

    public Valve getValve(){
        return basic;
    }
}
