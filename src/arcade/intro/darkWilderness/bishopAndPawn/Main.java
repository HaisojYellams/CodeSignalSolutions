package arcade.intro.darkWilderness.bishopAndPawn;

public class Main {
    boolean bishopAndPawn(String bishop, String pawn) {
        int[] bishopCoord = calculateCoordinate(bishop);
        int[] pawnCoord = calculateCoordinate(pawn);

        int diff1 = Math.abs(bishopCoord[0] - pawnCoord[0]);
        int diff2 = Math.abs(bishopCoord[1] - pawnCoord[1]);

        return diff1 == diff2;
    }

    int[] calculateCoordinate(String coordinate) {
        int[] coords = new int[2];
        coords[0] = coordinate.charAt(0) - 'a';
        coords[1] = Integer.parseInt(coordinate.substring(1));
        return coords;
    }
}
