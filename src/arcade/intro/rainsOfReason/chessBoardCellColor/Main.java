package arcade.intro.rainsOfReason.chessBoardCellColor;

public class Main {
    boolean chessBoardCellColor(String cell1, String cell2) {
        return (cellToInt(cell1) % 2) == (cellToInt(cell2) % 2);
    }

    int cellToInt(String cell) {
        return (cell.charAt(0) - 'A') + Integer.parseInt(cell.substring(1));
    }

}
