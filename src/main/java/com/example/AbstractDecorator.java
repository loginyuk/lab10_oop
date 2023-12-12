package com.example;

public abstract class AbstractDecorator implements Document {
    private final Document decoratedDocument;

    public AbstractDecorator(Document decoratedDocument) {
        this.decoratedDocument = decoratedDocument;
    }

    @Override
    public String parse() {
        return decoratedDocument.parse();
    }
}
