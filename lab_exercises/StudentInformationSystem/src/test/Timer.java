package test;

public class Timer {

    //Değişkenler

    private int hour;
    private int minute;
    private int second;

    //Constructor

    public Timer(int hour) {
        this.hour = hour;
    }

    public Timer(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Timer(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Method

}
