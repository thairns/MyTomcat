package responsibility_chain;

import factory.ApplicationFilterFactory;
import impl.FilterChain;
import impl.Valve;
import responsibility_chain.ApplicationFilterChain;
import server.Request;

public final class StandardWrapperValve  implements Valve{

    public final void invoke(Request request){
        //工厂模式
        ApplicationFilterFactory factory = ApplicationFilterFactory.getInstance();
        FilterChain filterChain = factory.createFilterChain(request);

        filterChain.doFilter(request.getRequest());
    }
}
