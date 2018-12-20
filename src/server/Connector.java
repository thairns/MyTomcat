package server;

import impl.Valve;
import observer.ConnectorConfig;
import observer.StandardEngine;
import template.LifecycleBase;

public class Connector extends LifecycleBase {
    private Valve basic = null;
    private ConnectorConfig config = null;

    public Connector(){
        startInternal();
    };

    @Override
    public void startInternal() {
        config = new ConnectorConfig();
        addLifecycleListener(config);
        addLifecycleListener(new ConnectorConfig());

        StandardEngine engine = new StandardEngine();
        engine.startInternal();

        setState("start","Connector");
        System.out.println("Connector Start");
    }

    @Override
    public void stopInternal() {
        System.out.println("Connector Stop");
        setState("stop","关闭Connector");
    }

    @Override
    public void destroyInternal() {
        System.out.println("Connector Destroy");
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
