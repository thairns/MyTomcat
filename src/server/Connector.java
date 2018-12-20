package server;

import impl.Valve;
import observer.ConnectorConfig;
import template.LifecycleBase;

public class Connector extends LifecycleBase {
    private Valve basic = null;
    private ConnectorConfig config = null;

    public Connector(){}

    @Override
    public void startInternal() {
        config = new ConnectorConfig();
        addLifecycleListener(config);

        setState("start","Connector");
        System.out.println("打开Connector");
    }

    @Override
    public void stopInternal() {
        System.out.println("Connector Stop");
        setState("stop","关闭Connector");
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
