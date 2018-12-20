package filter;

import impl.Filter;
import impl.FilterChain;
import impl.ServletRequest;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, FilterChain chain) {

        String context = (String)request.getAttribute("context");

        context = context.replaceAll("&quot;","\"")
                .replaceAll("&lt;","<")
                .replaceAll("&gt;",">");

        request.setAttribute("context",context);
        System.out.println("HTML实体过滤器：" + context);
        chain.doFilter(request);
    }
}
