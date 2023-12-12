package com.example;

public class PaperDecorator extends FlowerBucketDecorator {
    public PaperDecorator(FlowerBucket bucketWithSencor) {
        super(bucketWithSencor);
    }

    @Override
    public void addFlowers() {
        super.addFlowers();
        System.out.println("Wrapping the flower bucket with paper.");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Paper";
    }
}

