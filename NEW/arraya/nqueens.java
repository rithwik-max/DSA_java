public class nqueens{
    //check safe
    public static boolean safe(char board[][],int row,int col){
        //veritcal roww
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1 , j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
             if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueens(char board[][],int row){
        //base
        if(row == board.length){
            printnq(board);
            return;
        }
        //recursion
        for(int j=0;j<board.length;j++){ 
            if(safe(board,row,j)){
            board[row][j]='Q';
            nqueens(board, row+1);
            board[row][j]='.';
            }
        }
    }
    //printing
    public static void printnq(char board[][]){
        System.out.println("-----chessssss------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
                             
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int n=5;
        char board [][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueens(board, 0);
    }
}