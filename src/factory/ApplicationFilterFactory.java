package factory;

import filter.HTMLFilter;
import filter.ShieldFilter;
import filter.StandardFilter;
import impl.ServletRequest;
import responsibility_chain.ApplicationFilterChain;
import responsibility_chain.ApplicationFilterConfig;

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
        ApplicationFilterChain filterChain = new ApplicationFilterChain();
        request.setFilterChain(filterChain);
        //源代码上通过配置文件加载
        initFilterChain(filterChain);
        return filterChain;
    }

    //初始化过滤链
    private void initFilterChain(ApplicationFilterChain filterChain) {
        filterChain.addFilter(new ApplicationFilterConfig(new StandardFilter()));
        filterChain.addFilter(new ApplicationFilterConfig(new HTMLFilter()));
        filterChain.addFilter(new ApplicationFilterConfig(new ShieldFilter(new String[]{"小说","美洲"})));//过滤词
    }
}
