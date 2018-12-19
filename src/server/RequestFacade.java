/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package server;


import impl.HttpServletRequest;

public class RequestFacade implements HttpServletRequest {

    protected Request request = null;
    public RequestFacade(Request request){
        this.request = request;
    }


    @Override
    public String getHeader(String name) {
        if(request == null) throw new IllegalStateException("");
        return request.getHeader(name);
    }

    @Override
    public String getMethod() {
        if(request == null) throw new IllegalStateException("");
        return request.getMethod();
    }

    @Override
    public String getPathInfo() {
        if(request == null) throw new IllegalStateException("");
        return request.getPathInfo();
    }

    @Override
    public String getRequestedSessionId() {
        if(request == null) throw new IllegalStateException("");
        return request.getRequestedSessionId();
    }

    @Override
    public String getRequestURI() {
        if(request == null) throw new IllegalStateException("");
        return request.getRequestURI();
    }

    @Override
    public String getServletPath() {
        if(request == null) throw new IllegalStateException("");
        return request.getServletPath();
    }

    @Override
    public Object getAttribute(String name) {
        if(request == null) throw new IllegalStateException("");
        return request.getAttribute(name);
    }

    @Override
    public String getCharacterEncoding() {
        if(request == null) throw new IllegalStateException("");
        return request.getCharacterEncoding();
    }

    @Override
    public void setCharacterEncoding(String env) {
        if(request == null) throw new IllegalStateException("");
        request.setCharacterEncoding(env);
    }

    @Override
    public void setAttribute(String name, Object o) {
        if(request == null) throw new IllegalStateException("");
        request.setAttribute(name,o);
    }
}
