package responsibility_chain;

import filter.StandardFilter;
import impl.Filter;

public class ApplicationFilterConfig {
    private Filter filter = null;

    public ApplicationFilterConfig(Filter filter){
        this.filter = filter;
    }

    public Filter getFilter(){
        if (this.filter != null)
            return (this.filter);
        filter = new StandardFilter();
        return filter;
    }

}
