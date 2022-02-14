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

}
