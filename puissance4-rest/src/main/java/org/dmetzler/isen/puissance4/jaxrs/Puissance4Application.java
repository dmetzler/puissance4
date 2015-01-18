package org.dmetzler.isen.puissance4.jaxrs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api/*")
public class Puissance4Application extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.addAll(super.getClasses());
        classes.add(Puissance4API.class);
        classes.add(Puissance4GameBodyWriter.class);
        return classes;
    }
}
