package com.johanna.classes;

import java.util.*;

public class Main {

    private static final List<String> JDK_PACKAGE_PREFIXES =
            Arrays.asList("com.sun.", "java", "javax", "jdk", "org.w3c", "org.xml");

    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> stringClass = String.class;

        Map<String, Integer> mapObject = new HashMap<>();

        Class<?> hashMapClass = mapObject.getClass();

        Class<?> squareClass = Class.forName("com.johanna.tester.Main$Square");

        printClassInfo(stringClass, hashMapClass, squareClass);

        var circleObject = new Drawable() {
            @Override
            public int getNumberOfCorners() {
                return 0;
            }
        };


        printClassInfo(Collection.class, boolean.class, int[][].class, Color.class, circleObject.getClass());
    }

    private static void printClassInfo(Class<?>... classes) {


        for (Class<?> clazz : classes) {

            System.out.println(String.format("class name : %s, class package name : %s",
                    clazz.getSimpleName(),
                    clazz.getPackageName()));

            Class<?>[] implementedInterfaces = clazz.getInterfaces();

            for (Class<?> implementedInterface : implementedInterfaces) {
                System.out.println(String.format("class %s implements : %s",
                        clazz.getSimpleName(),
                        implementedInterface.getSimpleName()));
            }

            System.out.println("Is array : " + clazz.isArray());
            System.out.println("Is primitive : " + clazz.isPrimitive());
            System.out.println("Is enum : " + clazz.isEnum());
            System.out.println("Is interface : " + clazz.isInterface());
            System.out.println("Is anonymous :" + clazz.isAnonymousClass());
            System.out.println("Is JDK class :" + isJdkClass(clazz));

            System.out.println();
            System.out.println();
        }
    }

    public static boolean isJdkClass(Class<?> inputClass) {
        return JDK_PACKAGE_PREFIXES.stream()
                .anyMatch(prefix ->
                        inputClass.getPackage() == null ||
                                inputClass.getPackage().getName().startsWith(prefix)
                        );
    }

    public static String[] getAllInheritedClassNames(Class<?> inputClass) {
        String[] inheritedInterfaceNames;
        if (inputClass.isInterface()) {
            inheritedInterfaceNames = Arrays.stream(inputClass.getInterfaces())
                    .map(Class::getSimpleName)
                    .toArray(String[]::new);
        } else {
            inheritedInterfaceNames = inputClass.getSuperclass() != null ?
                    new String[]{inputClass.getSuperclass().getSimpleName()} : null;
        }
        return inheritedInterfaceNames;
    }

    private enum Color {
        BLUE,
        RED,
        GREEN
    }

    private static interface Drawable {
        int getNumberOfCorners();
    }

    static class Square implements Drawable {

        @Override
        public int getNumberOfCorners() {
            return 4;
        }
    }

}
