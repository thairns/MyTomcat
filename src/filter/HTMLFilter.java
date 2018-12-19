package filter;

import impl.Filter;
import impl.FilterChain;
import impl.ServletRequest;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, FilterChain chain) {
        String context = (String)request.getAttribute("context");

        context.replaceAll("</br>","\r\n" + "(HTMLFilter)");
        context.replaceAll("&quot;","\"");
        context.replaceAll("&nbsp;"," ");
        chain.doFilter(request);
    }
}
