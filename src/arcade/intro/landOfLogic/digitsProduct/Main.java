package arcade.intro.landOfLogic.digitsProduct;

public class Main {
    int digitsProduct(int product) {
        if (product < 10) {
            if (product == 0) {
                return 10;
            }
            return product;
        }
        StringBuilder builder = new StringBuilder();

        for (int factor = 9; factor > 1; factor--) {
            if (product == 1) {
                break;
            }
            while (product % factor == 0) {
                product /= factor;
                builder.append(factor);
            }
        }

        return product == 1 ? Integer.parseInt(builder.reverse().toString()) : -1;
    }
}
