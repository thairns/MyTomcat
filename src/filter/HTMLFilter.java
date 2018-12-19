package filter;

import impl.Filter;
import impl.FilterChain;
import impl.ServletRequest;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, FilterChain chain) {
        String context = (String)request.getAttribute("context");

        context = context.replaceAll("</br>","\r\n" + "(HTMLFilter)")
                .replaceAll("&quot;","\"")
                .replaceAll("&nbsp;"," ");

        request.setAttribute("context",context);
        chain.doFilter(request);
    }
}
