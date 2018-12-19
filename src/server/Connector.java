package server;

import impl.Valve;
import template.LifecycleBase;

public class Connector extends LifecycleBase {
    private Valve basic = null;

    public Connector(){};

    @Override
    public void startInternal() {
        System.out.println("Connector Start");
    }

    @Override
    public void stopInternal() {
        System.out.println("Connector Stop");
    }

    @Override
    public void destroyInternal() {
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
