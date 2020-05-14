package arcade.intro.darkWilderness.growingPlant;

public class Main {
    int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        if (upSpeed >= desiredHeight) {
            return 1;
        }
        return (int) Math.ceil(((float) (desiredHeight - downSpeed)) / (upSpeed - downSpeed));
    }
}
