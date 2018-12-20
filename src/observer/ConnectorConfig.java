package observer;

import impl.Config;
public class ConnectorConfig implements Config {

    @Override
    public void lifecycleEvent(LifecycleEvent event) {
        switch(event.getType()){
            case "start":
                System.out.println("监听自" + event.getData() + ",ConnectorConfig配置加载完成");
                break;
            case "stop":
                System.out.println("监听自" + event.getData() + ",ConnectorConfig配置销毁");
                break;
        }

    }
}
