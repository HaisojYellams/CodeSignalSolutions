package arcade.intro.throughTheFog.stringsRearrangement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String[] inputArray = {"abc",
                "bef",
                "bcc",
                "bec",
                "bbc",
                "bdc"};
        System.out.println(main.stringsRearrangement(inputArray));
    }

    boolean stringsRearrangement(String[] inputArray) {
        Map<Integer, Set<Integer>> adjacency = new HashMap<>(inputArray.length);
        for (int i = 0; i < inputArray.length; i++) {
            adjacency.put(i, new HashSet<>());
        }

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (doDifferByOne(inputArray[i], inputArray[j])) {
                    adjacency.get(i).add(j);
                    adjacency.get(j).add(i);
                }
            }
        }

        Set<Integer> inStack = new HashSet<>();
        for (int i = 0; i < inputArray.length; i++) {
            inStack.add(i);
            if (dfs(i, adjacency, inStack)) {
                return true;
            }
            inStack.remove(i);
        }

        return false;
    }

    boolean dfs(int node, Map<Integer, Set<Integer>> adjacency, Set<Integer> inStack) {
        if (inStack.size() == adjacency.size()) {
            return true;
        }

        for (int neighbor : adjacency.get(node)){
            if (!inStack.contains(neighbor)){
                inStack.add(neighbor);
                if (dfs(neighbor, adjacency, inStack)){
                    return true;
                }
                inStack.remove(neighbor);
            }
        }

        return false;
    }

    boolean doDifferByOne(String first, String second) {
        boolean foundOne = false;
        for (int i = 0, len = first.length(); i < len; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundOne) {
                    return false;
                }

                foundOne = true;
            }
        }

        return foundOne;
    }
}
