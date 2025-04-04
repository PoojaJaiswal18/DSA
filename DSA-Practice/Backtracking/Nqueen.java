package Backtracking;

public class Nqueen {


    public static boolean isSafe(char[][] board,int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
                if((board[i][col]=='Q')){
                    return false;
                }
        }

//left diagonal
        for (int i = row-1, j=col-1; i >=0 && j>=0 ; i--, j--) {
                if(board[i][j]=='Q'){
                    return false;
                }
        }

// right diagonal

        for (int i = row, j=col; i >=0 && j<board.length; i--, j++) {

                if(board[i][j]=='Q'){
                    return false;
                }



        }




       return true;


    }



    public static void Nqueen(int N,int row,char[][] board ){
        if(row==N){
            for (int i = 0; i <N; i++) {
                for (int j = 0; j <N ; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println("==========================");
            return;
        }
        for(int col=0;col<N;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                Nqueen(N,row+1,board);
                board[row][col]='.';  //undo since backtracking
            }

        }




    }

    public static void main(String[] args) {

        char[][] board=new char[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='.';
            }

        }

        Nqueen(8,0,board);

    }
}
