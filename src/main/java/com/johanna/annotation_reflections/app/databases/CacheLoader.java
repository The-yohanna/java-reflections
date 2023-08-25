package com.johanna.annotation_reflections.app.databases;

import com.johanna.annotation_reflections.annotations.InitializerClass;
import com.johanna.annotation_reflections.annotations.InitializerMethod;

@InitializerClass
public class CacheLoader {

    @InitializerMethod
    public void loadCache() {
        System.out.println("Loading data from cache");
    }

    public void reloadCache() {
        System.out.println("Reload cache");
    }
}
