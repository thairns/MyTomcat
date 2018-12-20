package observer;

import impl.Config;

public class StandardEngineConfig implements Config {
    @Override
    public void lifecycleEvent(LifecycleEvent event) {
        switch(event.getType()){
            case "start":
                System.out.println("StandarEngineConfig配置加载完成");
                break;
            case "stop":
                System.out.println("StandarEngineConfig配置销毁");
                break;
        }
    }
}
