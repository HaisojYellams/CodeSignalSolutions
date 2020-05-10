package arcade.intro.checkPalindrome;

public class Main {
    boolean checkPalindrome(String inputString){
        for (int forward=0, backward=inputString.length()-1; forward < backward; forward++, backward--){
            if (inputString.charAt(forward) != inputString.charAt(backward)){
                return false;
            }
        }
        return true;
    }
}
