package start;

import server.Connector;
import server.Request;

public class Main {
    public static void main(String[] args){
        Connector connector = new Connector();

        //在这里创建的是request对象，但是当调用getRequest时，取得的是RequestFacade对象
        Request request = connector.createRequest();
        //connector将请求发送给Service容器的一条Valve责任链进行处理，当到达StandardWrapperValve时，
        //StandarContext的invoke(request,response);
        //获取Servlet过滤链FilterChain
        connector.getValve().invoke(request);
    }
}
