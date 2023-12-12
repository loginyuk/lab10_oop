package com.example;

import java.util.HashMap;
import java.util.Map;

public class CachedDocument extends AbstractDecorator {
    private final Map<String, String> cache;

    public CachedDocument(Document decoratedDocument) {
        super(decoratedDocument);
        this.cache = new HashMap<>();
    }

    @Override
    public String parse() {
        if (cache.containsKey(super.toString())) {
            System.out.println("Using cached result");
            return cache.get(super.toString());
        }


        String result = super.parse();
        cache.put(super.toString(), result);
        return result;
    }
}
