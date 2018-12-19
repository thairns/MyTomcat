
package impl;

public interface ServletRequest {
    Object getAttribute(String name);
    String getCharacterEncoding();

    void setCharacterEncoding(String env);
    void setAttribute(String name, Object o);
    void setFilterChain(FilterChain filterChain);
}
