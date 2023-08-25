package com.johanna.annotation_reflections.app;

import com.johanna.annotation_reflections.annotations.InitializerClass;
import com.johanna.annotation_reflections.annotations.InitializerMethod;

@InitializerClass
public class AutoSaver {

    @InitializerMethod
    public void startAutoSavingThreads() {
        System.out.println("Start automatic data saving to disk");
    }
}
