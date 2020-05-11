package arcade.intro.edgeOfTheOcean.adjacentElementsProduct;

public class Main {
    int adjacentElementsProduct(int[] inputArray) {
        int maxProduct = inputArray[0] * inputArray[1];
        for (int i=2; i<inputArray.length; i++){
            if (inputArray[i] == 0){
                continue;
            }

            int prod = inputArray[i-1] * inputArray[i];
            if (prod > maxProduct){
                maxProduct = prod;
            }
        }

        return maxProduct;
    }
}
