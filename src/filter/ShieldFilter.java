package filter;

import impl.Filter;
import impl.FilterChain;
import impl.ServletRequest;

public class ShieldFilter implements Filter{
    private String[] shields;

    public ShieldFilter(String[] shields){
        this.shields = shields;
    }

    @Override
    public void doFilter(ServletRequest request, FilterChain chain) {

        String context = (String) request.getAttribute("context");
        for(String shield : shields){
            context = context.replaceAll(shield,"**");
        }
        request.setAttribute("context",context);
        System.out.println("敏感词过滤器：" + context);
        chain.doFilter(request);
    }
}
