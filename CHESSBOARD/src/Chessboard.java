package src;

public class Chessboard {
    private int[][] chessman;// 定义棋盘
    private int Row;// 行
    private int Col;// 列

    public Chessboard() {

    }

    public Chessboard(int Row, int Col) {
        this.Row = Row;
        this.Col = Col;
    }

    public int[][] getChessman() {
        return chessman;
    }

    public void setChessman(int[][] chessman) {
        this.chessman = chessman;
    }

    public int getRow() {
        return Row;
    }

    public void setRow(int Row) {
        this.Row = Row;
    }

    public int getCol() {
        return Col;
    }

    public void setCol(int Col) {
        this.Col = Col;
    }

}
