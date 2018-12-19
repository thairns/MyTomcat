package filter;

import impl.Filter;
import impl.FilterChain;
import impl.ServletRequest;

public class StandardFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, FilterChain chain) {
        System.out.println("This is a Standard Filter which just take a target to the request");
        //这个方式下的责任链是通过递归的方式实现的。
        chain.doFilter(request);
    }
}
