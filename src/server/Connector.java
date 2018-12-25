package server;

import impl.Valve;
import observer.ConnectorConfig;
import responsibility_chain.StandardWrapperValve;
import template.LifecycleBase;

public class Connector extends LifecycleBase {
    private Valve basic = null;
    private ConnectorConfig config = null;

    public Connector(){}

    @Override
    public void startInternal() {
        config = new ConnectorConfig();
        addLifecycleListener(config);

        StandardWrapperValve valve = new StandardWrapperValve();
        setValve(valve);

        setState("start","Connector");
        System.out.println("打开Connector");
    }

    @Override
    public void stopInternal() {
        setState("stop","Connector");
        System.out.println("关闭Connector");
    }

    public Request createRequest(Form form,String attribute){
        Request request = new Request();
        request.setAttribute(attribute,form.getAttribute(attribute));
        return request;
    }

    public Valve getValve(){
        return basic;
    }

    public void setValve(Valve valve){
        this.basic = valve;
    }
}
