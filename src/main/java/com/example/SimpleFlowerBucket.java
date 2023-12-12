package com.example;

public class SimpleFlowerBucket implements FlowerBucket {
    @Override
    public void addFlowers() {
        System.out.println("Adding flowers to the flower bucket.");
    }

    @Override
    public String getDescription() {
        return "Simple Flower Bucket";
    }
}

