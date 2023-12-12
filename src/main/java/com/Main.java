package com;

import com.example.*;
import com.example.FlowerBucket;

public class Main {
    public static void main(String[] args) {
        FlowerBucket simpleBucket = new SimpleFlowerBucket();
        simpleBucket.addFlowers();
        System.out.println("Description: " + simpleBucket.getDescription());

        System.out.println("\nDecorated Flower Bucket:");

        // Decorating with Ribbon
        FlowerBucket ribbonbucketWithSencor = new RibbonDecorator(simpleBucket);
        ribbonbucketWithSencor.addFlowers();
        System.out.println("Description: " + ribbonbucketWithSencor.getDescription());

        // Decorating with Paper
        FlowerBucket paperbucketWithSencor = new PaperDecorator(simpleBucket);
        paperbucketWithSencor.addFlowers();
        System.out.println("Description: " + paperbucketWithSencor.getDescription());
    }
}
