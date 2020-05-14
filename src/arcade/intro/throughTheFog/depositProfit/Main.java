package arcade.intro.throughTheFog.depositProfit;

public class Main {
    int depositProfit(int deposit, int rate, int threshold) {
        return (int) Math.ceil((Math.log(threshold) - Math.log(deposit)) / Math.log(1 + (rate / 100.0)));
    }
}
