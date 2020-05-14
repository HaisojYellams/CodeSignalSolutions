package arcade.intro.darkWilderness.digitDegree;

public class Main {
    int digitDegree(int n) {
        if (n < 10) {
            return 0;
        }

        int sumOfDigits = 0;
        while (n > 0) {
            sumOfDigits += n % 10;
            n /= 10;
        }

        return 1 + digitDegree(sumOfDigits);
    }

}
