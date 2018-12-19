package server;

import impl.Valve;

public class Connector extends LifecycleBase{
    private Valve basic = null;

    public Connector(){};

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
        request.setAttribute("context","Hello world!一二三&nbsp;三三饵丝");
        return request;
    }

    public Valve getValve(){
        return basic;
    }

    public void setValve(Valve valve){
        this.basic = valve;
    }
}
