package org.apache.catalina.session;

import java.util.HashMap;
import java.util.Map;

public class Session {

    private final String id;
    private final Map<String, Object> values;

    public Session(final String id) {
        this.id = id;
        this.values = new HashMap<>();
    }

    public String getId() {
        return this.id;
    }

    public void setAttribute(final String name, final Object value) {
        values.put(name, value);
    }

    public Object getAttribute(final String name) {
        return values.get(name);
    }

    public void removeAttribute(final String name) {
        values.remove(name);
    }

    public void invalidate() {
        values.clear();
    }
}
