package filter;

import impl.Filter;
import impl.FilterChain;
import impl.ServletRequest;

public class StandardFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, FilterChain chain) {

        System.out.println("这是一个标准过滤器，是过滤链第一个过滤器，不做任何处理");
        //这个方式下的责任链是通过递归的方式实现的。
        System.out.println("标准过滤器：" + request.getAttribute("context"));
        chain.doFilter(request);
    }
}
