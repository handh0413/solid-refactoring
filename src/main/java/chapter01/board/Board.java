package chapter01.board;

import java.util.ArrayList;

public class Board {
    ArrayList<String> spots;

    public Board() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i ++) {
            spots.add(String.valueOf(i));
        }
    }

    public ArrayList<String> firstRow() {
        ArrayList<String> firstRow = new ArrayList<>();
        firstRow.add(this.spots.get(0));
        firstRow.add(this.spots.get(1));
        firstRow.add(this.spots.get(2));
        return firstRow;
    }

    public ArrayList<String> secondRow() {
        ArrayList<String> sencondRow = new ArrayList<>();
        sencondRow.add(this.spots.get(3));
        sencondRow.add(this.spots.get(4));
        sencondRow.add(this.spots.get(5));
        return sencondRow;
    }

    public ArrayList<String> thirdRow() {
        ArrayList<String> thirdRow = new ArrayList<>();
        thirdRow.add(this.spots.get(6));
        thirdRow.add(this.spots.get(7));
        thirdRow.add(this.spots.get(8));
        return thirdRow;
    }

    public void display() {
        String formattedFirstRow = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n" + this.spots.get(3) + " | " + this.spots.get(4)  + " | " +  this.spots.get(5) + "\n" + this.spots.get(6) + " | " + this.spots.get(7)  + " | " +  this.spots.get(8);
        System.out.print(formattedFirstRow);
    }
}
