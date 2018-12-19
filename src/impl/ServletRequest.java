
package impl;

public interface ServletRequest {
    Object getAttribute(String name);
    void setAttribute(String name, Object o);
    void setFilterChain(FilterChain filterChain);
}
