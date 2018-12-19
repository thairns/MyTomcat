package start;

import server.Connector;
import server.Request;
import responsibility_chain.StandardWrapperValve;

public class Main {
    public static void main(String[] args){
        //外观模式、工厂模式、责任链模式、观察者模式、模板模式
        Connector connector = new Connector();

        //根据请求创建request
        //在这里创建的是request对象，但是当调用getRequest时，取得的是RequestFacade对象
        Request request = connector.createRequest();
        //connector将请求发送给Service容器的一条Valve责任链进行处理，当到达StandardWrapperValve时，
        //StandarContext的invoke(request,response);
        //获取Servlet过滤链FilterChain
        StandardWrapperValve valve = new StandardWrapperValve();
        connector.setValve(valve);
        connector.getValve().invoke(request);

        System.out.println(request.getAttribute("context"));
    }
}
