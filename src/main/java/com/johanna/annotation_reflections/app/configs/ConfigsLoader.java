package com.johanna.annotation_reflections.app.configs;

import com.johanna.annotation_reflections.annotations.InitializerClass;
import com.johanna.annotation_reflections.annotations.InitializerMethod;

@InitializerClass
public class ConfigsLoader {

    @InitializerMethod
    public void loadAllConfigs() {
        System.out.println("Loading all configuration files");
    }

}
