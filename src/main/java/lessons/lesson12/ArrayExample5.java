package lessons.lesson12;

public class ArrayExample5 {
    public static void main(String[] args) {

        String [] [] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i+j) % 2 == 0) {chessBoard[i][j] = " W ";
                } else {chessBoard[i][j] = " B ";}
            }


        }

        System.out.println("    1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");

        for (int i = 0; i < chessBoard.length; i++) {
            System.out.print(i+1+" |");
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(chessBoard[i][j] + "|");
            }
            System.out.println();
        }

    }
}
