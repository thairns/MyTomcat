package server;

import impl.Filter;
import impl.ServletRequest;

public class ApplicationFilterConfig {
    private Filter filter = null;

    ApplicationFilterConfig(Filter filter){
        this.filter = filter;
    }

    public Filter getFilter(){
        if (this.filter != null)
            return (this.filter);
        filter = new StandardFilter();
        return filter;
    }

}
