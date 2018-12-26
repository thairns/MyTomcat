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


import facade.RequestFacade;
import impl.FilterChain;
import impl.HttpServletRequest;

import java.util.HashMap;
import java.util.Map;

public class Request implements HttpServletRequest {

    private Map<String,Object> attributes = null;

    public Request() {
        attributes = new HashMap<String,Object>();
    }



    protected RequestFacade facade = null;

    public HttpServletRequest getRequest() {
       if(facade == null){
           facade = new RequestFacade(this);
       }
       return facade;
    }

    @Override
    public Object getAttribute(String name) {
        return attributes.get(name);
    }

    @Override
    public void setAttribute(String name, Object o) {
        attributes.put(name,o);
    }

    @Override
    public void setFilterChain(FilterChain filterChain) {

    }

    @Override
    public String getHeader(String name) {
        return "RequestHead";
    }
}
