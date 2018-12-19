package server;

import impl.RequestDispatcher;
import impl.ServletRequest;

public class ApplicationDispatcher implements RequestDispatcher {
    @Override
    public void forward(ServletRequest request) {
        doForward(request);
    }

    private void doForward(ServletRequest request) {
        processRequest(request);
    }

    private void processRequest(ServletRequest request) {
        invoke(request);
    }

    private void invoke(ServletRequest request) {
    }

    @Override
    public void include(ServletRequest request) {

    }
}
