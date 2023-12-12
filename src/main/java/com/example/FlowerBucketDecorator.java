package com.example;

abstract class FlowerBucketDecorator implements FlowerBucket {
    protected FlowerBucket bucketWithSencor;

    public FlowerBucketDecorator(FlowerBucket bucketWithSencor) {
        this.bucketWithSencor = bucketWithSencor;
    }

    @Override
    public void addFlowers() {
        bucketWithSencor.addFlowers();
    }

    @Override
    public String getDescription() {
        return bucketWithSencor.getDescription();
    }
}

