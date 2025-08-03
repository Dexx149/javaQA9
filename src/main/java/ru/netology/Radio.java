package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsCount;

    public Radio() {
        stationsCount = 10;
    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount > 0 ? stationsCount : 10;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationsCount() {
        return stationsCount;
    }

    public void nextStation() {
        if (currentStation == stationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}