package arcade.intro.smoothSailing.sortByHeight;

import java.util.Arrays;

public class Main {
    int[] sortByHeight(int[] a) {
        int[] sortedPeople = Arrays.stream(a)
                .filter(x -> x != -1)
                .sorted()
                .toArray();
        int index = 0;
        for (int i=0; i<a.length; i++){
            if (a[i] != -1){
                a[i] = sortedPeople[index];
                index++;
            }
        }

        return a;
    }

}
