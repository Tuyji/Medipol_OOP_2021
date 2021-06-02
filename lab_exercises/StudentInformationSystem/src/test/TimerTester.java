package test;

public class TimerTester {

    public static void main(String[] args) {

        int hour = 12;
        int minute = 24;
        int second = 55;

        // 12:24:55

        Timer timer = new Timer(hour);

        Timer timerWithMinute = new Timer(hour, minute);

        Timer timerWithSecond = new Timer(hour, minute, second);




    }


}
