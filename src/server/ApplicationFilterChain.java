package server;

import impl.FilterChain;
import impl.ServletRequest;

public class ApplicationFilterChain  implements FilterChain{
    private ApplicationFilterConfig[] filters = new ApplicationFilterConfig[0];
    private int n = 0;
    public static final int INCREMENT = 10;

    @Override
    public void doFilter(ServletRequest request) {
        internalDoFilter(request);
    }

    private void internalDoFilter(ServletRequest request) {

    }

    void addFilter(ApplicationFilterConfig filterConfig){
        for(ApplicationFilterConfig filter:filters)
            if(filter==filterConfig)
                return;
        if (n == filters.length) {
            ApplicationFilterConfig[] newFilters =
                    new ApplicationFilterConfig[n + INCREMENT];
            System.arraycopy(filters, 0, newFilters, 0, n);
            filters = newFilters;
        }
        filters[n++] = filterConfig;
    }
}
