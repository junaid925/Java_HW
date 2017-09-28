public class Hw4{

 public static void main(String[] args) {
  placeQueens(4);
 }

 private static void placeQueens(int gSize) {

  if(gSize<4){
   System.out.println("No Solution");
  }
  else{
   int[] board = new int[gSize];
   placeAllQueens(board, 0);
   printBoard(board);
  }
 }

 private static boolean placeAllQueens(int[] board, int row) {
  if(row == board.length){
   return true;
  }

  boolean isAllQueensPlaced = false;
  for (int column = 0; column < board.length; column++) {
   board[row] = column;
   if(isSafe(board, row)){
    isAllQueensPlaced = placeAllQueens(board, row+1);
   }

   if(isAllQueensPlaced){
    return true;
   }
  }
  return false;
 }

 private static boolean isSafe(int[] board, int row) {
  for (int i = 0; i < row; i++) {

   if(board[row] == board[i]){
    return false;
   }


   if(Math.abs(board[row] - board[i]) == Math.abs(row-i)){
    return false;
   }
  }
  return true;
 }

 private static void printBoard(int[] board) {

  for (int i = 0; i < board.length; i++) {
   for (int j = 0; j < board.length; j++) {
    if(j==board[i]){
     System.out.print("1 ");
    }else{
     System.out.print("0 ");
    }
   }
   System.out.println();
  }
 }

}
