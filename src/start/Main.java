package start;

import server.Connector;
import server.Form;
import server.Request;
import responsibility_chain.StandardWrapperValve;

import java.util.HashMap;
import java.util.Map;

/**
 * 外观模式、工厂模式、责任链模式、观察者模式、模板模式
 */
public class Main {
    public static void main(String[] args){
        Map<String, Object> map = new HashMap<>();
        String context = "&lt;百年孤独&gt;是哥伦比亚作家加西亚·马尔克斯创作的长篇小说，是拉丁美洲魔幻现实主义文学的代表作，被誉为&quot;再现拉丁美洲历史社会图景的鸿篇巨著&quot;。";
        map.put("context",context);
        Form form = new Form(map);



        /* 观察者模式、模板模式
         *  模拟请求最开始时创建的一个连接，对于每个组件的创建，
         *  每个组件都具有通用的方法（不变部分），也有独特的方法（可变部分）
         *  每个组件都有自己的生命周期，所以可以充当被观察者，当其生命周期发生改变时
         *  通知相关组件（观察者）进行相关操作
         */
        // Connector 是从被观察者模板的基础上创建的，每个组件都有着相同的生命周期操作
        Connector connector = new Connector();
        // 组件创建时，为其添加观察者，当组件状态发生变化时，通知观察者
        connector.startInternal();  //通知观察者

        // 外观模式
        // 根据请求创建request，由于没有传入，所以在创建request时也对内容作了初始化
        // 在这里创建的是request对象，但是当调用getRequest时，取得的是RequestFacade对象
        // 在这里，request使用外观模式，使用者调用时访问的是RequestFacade
        // 屏蔽了request一些不需要被外界知道的接口，调用者无需了解request本身的复杂内容
        Request request = connector.createRequest(form,"context");

        /* 工厂模式、责任链模式
         *  connector将请求发送给Service容器的一条Valve责任链进行处理，当找到对应的Wrapper时，
         *  通过一系列的阈门（典型责任链模式），取得过滤链
         */
        StandardWrapperValve valve = new StandardWrapperValve();
        connector.setValve(valve);

        // invoke方法取得ApplicationFilterFactory(工厂模式），创建并生产责任链这一产品
        System.out.println("============过滤链=============");
        connector.getValve().invoke(request);
        System.out.println("===============================");

        System.out.println(request.getAttribute("context"));
        connector.stopInternal();   //通知观察者
    }
}
