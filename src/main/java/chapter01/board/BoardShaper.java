package chapter01.board;

import java.util.ArrayList;

public class BoardShaper {
    private Board board;

    public BoardShaper(Board board) {
        this.board = board;
    }

    public ArrayList<String> firstRow() {
        ArrayList<String> firstRow = new ArrayList<>();
        firstRow.add(board.spots.get(0));
        firstRow.add(board.spots.get(1));
        firstRow.add(board.spots.get(2));
        return firstRow;
    }

    public ArrayList<String> secondRow() {
        ArrayList<String> sencondRow = new ArrayList<>();
        sencondRow.add(board.spots.get(3));
        sencondRow.add(board.spots.get(4));
        sencondRow.add(board.spots.get(5));
        return sencondRow;
    }

    public ArrayList<String> thirdRow() {
        ArrayList<String> thirdRow = new ArrayList<>();
        thirdRow.add(board.spots.get(6));
        thirdRow.add(board.spots.get(7));
        thirdRow.add(board.spots.get(8));
        return thirdRow;
    }
}
