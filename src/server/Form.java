package server;

import java.util.Map;

public class Form {
    private Map<String,Object> data ;

    public Form(Map<String,Object> data){
        this.data = data;
    }

    public Map<String,Object> getData(){return data;}

    public void setData(Map<String,Object> data){this.data = data;}

    public Object getAttribute(String name){
        return data.get(name);
    }

    public void setAttribute(String name,Object o){
        data.put(name,o);
    }
}
