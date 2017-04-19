package main.java.com.rest.jersey2;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("appka")
public class MyApplication extends Application {
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(XMLBasedReverser.class);
        s.add(JSONBasedReverser.class);
        return s;
    }
}