package com.example;

public class Joker {

    static private String joke;
    static private boolean done;

    static public String getJoke() {
        if (done) {
            return joke;
        } else {return null;}
    }

    static public void callback(String result) {
        joke = result;
        done = true;
    }

    static public void notifyAsyncStart() {done = false;}
}
