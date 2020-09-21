package ru.netology.domain;

public class Conditioner {
    private int maxTemperature = 26;
    private int minTemperature = 16;
    private int currentTemperature;

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {

        if (currentTemperature > maxTemperature)
            return;
        if (currentTemperature < minTemperature)
            return;

        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature < maxTemperature)
            currentTemperature++;
    }

    public void decreaseCurrentTemperature() {

        if (currentTemperature > minTemperature)
            currentTemperature--;
    }
}









