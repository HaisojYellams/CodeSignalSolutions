package arcade.intro.landOfLogic.validTime;

public class Main {
    boolean validTime(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        if (hours < 0 || hours > 23) {
            return false;
        }

        int minutes = Integer.parseInt(time.substring(3));
        return minutes >= 0 && minutes < 60;
    }
}
