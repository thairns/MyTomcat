package impl;

import server.Request;

public interface Valve {

    void invoke(Request request);
}
