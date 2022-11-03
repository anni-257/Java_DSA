class N_Queens{

    public static boolean isSafe(char board[][],int row,int col){
        // verical up

        for(int i=row-1,j=col;i>=0;i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // left diagonal

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // right diagonal

        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char arr[][],int row){
        if(row==arr.length){
            printBoard(arr);
            return;
        }

        // place Queen in columns
        for(int j=0;j<arr.length;j++){
            if(isSafe(arr, row, j)){
                arr[row][j]='Q';
                nQueens(arr, row+1) ;
                arr[row][j]='X';
            }
            
        }

    }

    public static void printBoard(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }System.out.println();
    }

    public static void main(String args[]){
        char board[][]=new char[5][5];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }

         nQueens(board,0);
    }
}