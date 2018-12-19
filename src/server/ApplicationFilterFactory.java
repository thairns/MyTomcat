package server;

import impl.ServletRequest;

public final class ApplicationFilterFactory {
    private static ApplicationFilterFactory factory = null;
    private ApplicationFilterFactory(){}

    public static ApplicationFilterFactory getInstance() {
        if (factory == null) {
            factory = new ApplicationFilterFactory();
        }
        return factory;
    }

    //构造初始化过滤链
    public ApplicationFilterChain createFilterChain(ServletRequest request){
        ApplicationFilterChain filterChain = null;

        filterChain = new ApplicationFilterChain();
        request.setFilterChain(filterChain);
        //源代码上通过配置文件加载
        initFilterChain(filterChain);
        return filterChain;
    }

    //初始化过滤链
    private void initFilterChain(ApplicationFilterChain filterChain) {
        filterChain.addFilter(new ApplicationFilterConfig(new StandardFilter()));
    }
}
