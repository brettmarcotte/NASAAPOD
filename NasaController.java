package com.example.HelloInternet.controllers;

public class NasaController {

    private String date;
    private String explanation;
    private String url;
    private String title;

    @Override
    public String toString() {
        return "NasaController{" +
                "date='" + date + '\'' +
                ", explanation='" + explanation + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getUrl() {

        return url;
    }

    public String getTitle() {
        return title;
    }
}
