package ShamilVagabov;

public class CurrentTime {
    public static void main(String[] args) {
        currentTime();
    }

    public static void currentTime(){
        //obtain the total milliseconds since Januare 1, 1970 from midnight
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println("Current time is " + currentHours +
                ":" + currentMinutes + ":" + currentSeconds + " GTM");

        System.out.println("Current time in Moscow is "+ (currentHours + 3) +
                ":" + currentMinutes + ":" + currentSeconds + " GTM");
    }
}
