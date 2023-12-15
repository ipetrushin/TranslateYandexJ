package com.example.translateyandexj;

public class Response {
    int total, totalHits;
    Hit[] hits;

    @Override
    public String toString() {

        return "totalHits = " + totalHits;
    }
}
