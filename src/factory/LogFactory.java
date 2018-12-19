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

package factory;


import impl.Log;
import log.DirectJDKLog;

import java.util.Properties;
import java.util.logging.LogManager;


public class LogFactory {

    private static LogFactory singleton=new LogFactory();

    Properties logConfig;

    private LogFactory() {
        logConfig=new Properties();
    }
    
    void setLogConfig( Properties p ) {
        this.logConfig=p;
    }

    public Log getInstance(String name) {
        return DirectJDKLog.getInstance(name);
    }

    public Log getInstance(Class<?> clazz) {
        return getInstance( clazz.getName());
    }

    public static LogFactory getFactory(){
        return singleton;
    }

    public static Log getLog(Class<?> clazz){
        return (getFactory().getInstance(clazz));
    }

    public static Log getLog(String name){
        return (getFactory().getInstance(name));
    }

    public static void release(ClassLoader classLoader) {
        if (!LogManager.getLogManager().getClass().getName().equals(
                "java.util.logging.LogManager")) {
            LogManager.getLogManager().reset();
        }
    }
}
