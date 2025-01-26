// all possible arrangement time[0(n*n!)]
/*public class Backtracking {
    public static void printpermutation(String str,int index,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            printpermutation(newstr,index+1,perm+curr);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printpermutation(str, 0," ");
    }
}*/
// N-queens time[0()]
/*import java.util.Scanner;
public class Backtracking {
    public static void placeNQueens(int N){
        int board[][]=new int[N][N];
        placeQueens(board,0,N);
    }
    private static void placeQueens(int [][]board,int row,int N){
        if(N==row){
            printArray(board);
            System.out.println();
        }
        for(int j=0;j<N;j++){
            if(isBoardsafe(board,row,j)){
                board[row][j]=1;
                placeQueens(board, row+1, N);
                board[row][j]=0;
            }
        }
    }
    private static boolean isBoardsafe(int [][]board,int row,int column){
        int N=board.length;
        for(int i=row-1,j=column-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row+1,j=column+1;i<N && j<N;i++,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=column+1;i>=0 && j<N;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row+1,j=column-1;i<N && j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row-1;i>=0;i--){
            if(board[i][column]==1){
                return false;
            }
        }
        for(int i=row-1;i<N;i++){
            if(board[i][column]==1){
                return false;
            }
        }
        return true;
    }
    public static void printArray(int [][]arr){
        System.out.println("Possible placing of the Queens");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]!=0)
                    System.out.println("YES"+"\t");
                else
                    System.out.println("NO"+"\t");
            }
                System.out.println();
            }
            System.out.println("------------");
        }
        public static void main(String args[]){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the size of the board");
            int size=scan.nextInt();
            if(size>3){
                placeNQueens(size);
            }else{
                System.out.println("Size is less than 4! No placement for queens");
            }
        }
    }*/
// Suduko solver
/*public class Backtracking{
public boolean isSafe(char[][] board, int row, int col, int number) {
       //column
       for(int i=0; i<board.length; i++) {
           if(board[i][col] == (char)(number+'0')) {
               return false;
           }
       }
      
       //row
       for(int j=0; j<board.length; j++) {
           if(board[row][j] == (char)(number+'0')) {
               return false;
           }
       }
      
       //grid
       int sr = 3 * (row/3);
       int sc = 3 * (col/3);
      
       for(int i=sr; i<sr+3; i++) {
           for(int j=sc; j<sc+3; j++) {
               if(board[i][j] == (char)(number+'0')) {
                   return false;
               }
           }
       }
      
       return true;
   }
  
   public boolean helper(char[][] board, int row, int col) {
       if(row == board.length) {
           return true;
       }
      
       int nrow = 0;
       int ncol = 0;
      
       if(col == board.length-1) {
           nrow = row + 1;
           ncol = 0;
       } else {
           nrow = row;
           ncol = col + 1;
       }
      
       if(board[row][col] != '.') {
           if(helper(board, nrow, ncol)) {
               return true;
           }
       } else {
          
           //fill the place
           for(int i=1; i<=9; i++) {
               if(isSafe(board, row, col, i)) {
                   board[row][col] = (char)(i+'0');
                   if(helper(board, nrow, ncol))
                       return true;
                   else
                        board[row][col] = '.';
               }
           }
       }
                     
       return false;
   }
  
   public void solveSudoku(char[][] board) {
       helper(board, 0, 0);
   }
}
*/
