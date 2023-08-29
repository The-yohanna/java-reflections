package com.johanna.tester;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Class<?>  clazz = names.getClass();
        System.out.println(clazz.getTypeName());
    }

}
