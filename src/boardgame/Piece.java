package boardgame;

public class Piece {

    protected Position position;
    private Board bord;

    public Piece() {
    }

    public Piece(Board bord) {
        this.bord = bord;
    }

    protected Board getBord() {
        return bord;
    }

}
