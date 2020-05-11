package arcade.intro.islandOfKnowledge.areEquallyStrong;

public class Main {
    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int yourStrong = Math.max(yourLeft, yourRight);
        int yourWeak = Math.min(yourLeft, yourRight);
        int friendsStrong = Math.max(friendsLeft, friendsRight);
        int friendsWeak = Math.min(friendsLeft, friendsRight);

        return yourStrong == friendsStrong && yourWeak == friendsWeak;
    }
}
