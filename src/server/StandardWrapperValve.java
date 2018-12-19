package server;

import impl.Valve;

public final class StandardWrapperValve  implements Valve{

    public final void invoke(Request request){
        ApplicationFilterFactory factory = ApplicationFilterFactory.getInstance();
        ApplicationFilterChain filterChain = factory.createFilterChain(request);

        filterChain.doFilter(request.getRequest());
    }
}
