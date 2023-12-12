package com.example;

public class RibbonDecorator extends FlowerBucketDecorator {
    public RibbonDecorator(FlowerBucket bucketWithSencor) {
        super(bucketWithSencor);
    }

    @Override
    public void addFlowers() {
        super.addFlowers();
        System.out.println("Adding ribbon to the flower bucket.");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Ribbon";
    }
}

