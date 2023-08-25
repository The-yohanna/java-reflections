package com.johanna.polymorphic_reflections.logging;

import java.io.IOException;

public class FileLogger {
    public void sendRequest(String data) throws IOException {
        System.out.println(String.format("Data : %s was logged to the file system", data));
    }
}
