package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this.board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] result = {board[0][value], board[1][value], board[2][value]};
        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        String value = row[0];
        for (String mark : row) {
            if (!mark.equals(value)) return false;
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        String value = column[0];
        for (String mark : column) {
            if (!mark.equals(value)) return false;
        }
        return true;
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if (isRowHomogenous(i)){
                return getRow(i)[0];
            }
            if (isColumnHomogeneous(i)){
                return getColumn(i)[0];
            }
        }
        return diagonalWinner();
    }

    private String diagonalWinner() {
        String value = board[1][1];
        if (value.equals(board[0][0]) && value.equals(board[2][2])) return value;
        else if (value.equals(board[2][0]) && value.equals(board[0][2])) return value;
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
