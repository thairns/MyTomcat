package impl;

public interface RequestDispatcher {
    public void forward(ServletRequest request);
    public void include(ServletRequest request);
}
