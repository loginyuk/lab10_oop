package com.example;

public class TimedDocument extends AbstractDecorator {
    public TimedDocument(Document decoratedDocument) {
        super(decoratedDocument);
    }

    @Override
    public String parse() {
        long start = System.nanoTime();
        String result = super.parse();
        long elapsed = System.nanoTime() - start;
        System.out.println("Parsing time: " + elapsed + " nanoseconds");
        return result;
    }
}
