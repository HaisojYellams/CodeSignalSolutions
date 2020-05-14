package arcade.intro.throughTheFog.circleOfNumbers;

public class Main {
    int circleOfNumbers(int n, int firstNumber) {
        return (firstNumber + (n / 2)) % n;
    }

}
