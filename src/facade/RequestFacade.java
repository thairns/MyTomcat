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
package facade;


import impl.FilterChain;
import impl.HttpServletRequest;
import server.Request;

public class RequestFacade implements HttpServletRequest {

    protected Request request = null;
    public RequestFacade(Request request){
        this.request = request;
    }


    @Override
    public Object getAttribute(String name) {
        if(request == null) throw new IllegalStateException("");
        return request.getAttribute(name);
    }

    @Override
    public void setFilterChain(FilterChain filterChain) {
        request.setFilterChain(filterChain);
    }

    @Override
    public void setAttribute(String name, Object o) {
        if(request == null) throw new IllegalStateException("");
        request.setAttribute(name,o);
    }

    @Override
    public String getHeader(String name) {
        return "RequestFacade Heade";
    }
}
