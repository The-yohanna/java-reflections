package com.johanna.annotation_reflections.app.http;

import com.johanna.annotation_reflections.annotations.InitializerClass;
import com.johanna.annotation_reflections.annotations.InitializerMethod;

@InitializerClass
public class ServiceRegistry {

    @InitializerMethod
    public void registerService() {
        System.out.println("Service successfully registered");
    }
}
