package server;

import impl.Filter;
import impl.ServletRequest;

public class ApplicationFilterConfig {
    private Filter filter = null;

    public Filter getFilter(){
        if (this.filter != null)
            return (this.filter);
        filter = new Filter() {
            @Override
            public void doFilter(ServletRequest request) {

            }
        };
        return filter;
    }

}
