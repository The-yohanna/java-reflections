package com.johanna.annotation_reflections.app.databases;

import com.johanna.annotation_reflections.annotations.InitializerClass;
import com.johanna.annotation_reflections.annotations.InitializerMethod;

@InitializerClass
public class DatabaseConnection {

    @InitializerMethod
    public void connectToDatabase1() {
        System.out.println("Connecting to database 1");
    }

    @InitializerMethod
    public void connectToDatabase2() {
        System.out.println("Connecting to database 2");
    }
}
