package com.johanna.tester;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException {
        ClassLoader classLoader = Main.class.getClassLoader();
        URI packageUri = classLoader.getResource("tester").toURI();
        System.out.println(String.format("Package uri :%s", packageUri));
    }
}
