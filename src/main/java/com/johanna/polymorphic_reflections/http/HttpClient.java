package com.johanna.polymorphic_reflections.http;

public class HttpClient {
    private final String serverAddress;

    public HttpClient(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public boolean sendRequest(String data) {
        System.out.println(String.format("Request with body : %s was successfully sent to server with address : %s",
                data,
                serverAddress));
        return true;
    }
}
