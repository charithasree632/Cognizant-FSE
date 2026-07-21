package com.example.junitdemo2;

public class MyService {

    private ExternalAPI api;

    public MyService(ExternalAPI api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData();
    }
}