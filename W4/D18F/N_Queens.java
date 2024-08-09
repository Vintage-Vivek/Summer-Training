package W4.D18F;

public class N_Queens {
    public static void main(String[] args) {
        int n = 5;
        int[][] board = new int [n][n];
        NQueen (board, 0,n);
    }
    static boolean check(int[][] board, int i, int j, int n){
        //chk for verticals and horizontal in one "for" loop in the board
        for (int x = 0; x<n; x++) {
            if(board[x][j]==1 || board[i][j]==1){
                return false;
            }
            
        }
        // chk diagonals only in up direction
        int x = i, y = j;
        //left diagonal 
        while (x>=0 && y >=0){
            if (board[x][y] == 1) return false;
            x--;
            y--;
        }
        // right diagonal
        while (i>=0 && j<n){
            if (board[i][j]==1){
                return false;
            }
            i--;
            j++;
        }
        // safe to place
        return true;
    }
    static boolean NQueen(int[][] board ,int i, int n){
        //base case
        if (i==n) {
            //display the matrix
            for (int x = 0; x<n; x++) {
                for (int y = 0; y < n; y++) {
                    System.out.print(board[x][y]+" ");
                    
                }
                System.out.println();
            }
            System.out.println();
            return true ; //false karne pe this will give all outputs for your n.
        }
        for (int j = 0; j < n; j++) {
            if(check(board,i,j,n)){
                board[i][j]=1;
                if(NQueen(board, i+1, n)) return true;
                // backtracking
                board[i][j]=0;
            }
        }
        return false;
    }

}
