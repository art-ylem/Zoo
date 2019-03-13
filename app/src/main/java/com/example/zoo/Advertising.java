package com.example.zoo;

public class Advertising extends General {
    public String advText;

    public String getAdvText() {
        return advText;
    }

    public void setAdvText(String advText) {
        this.advText = advText;
    }

    public Advertising(String advText) {
        this.advText = advText;
    }

}
