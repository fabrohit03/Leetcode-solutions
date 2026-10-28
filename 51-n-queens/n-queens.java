class Solution {
    boolean isSafe(List<String>board,int row, int col,int n){
        for(int j=0; j<n; j++){
            if (board.get(row).charAt(j) == 'Q'){
                return false;
            }
           
        }
        for(int i=0; i<n; i++){
            if (board.get(i).charAt(col) == 'Q'){
                return false;
            }
        }

        for(int i=row , j=col; i>=0 && j>=0; i--,j--){
             if (board.get(i).charAt(j) == 'Q')  return false;
        }

        for(int i=row , j=col; i>=0 && j<n; i--,j++){
            if (board.get(i).charAt(j) == 'Q') return false;
        }
        return true;
    }
    void nQueens(List<String>board, int row, int n, List<List<String>>res){
        if(row==n){
            List<String> temp = new ArrayList<>();
            for(String s: board){
                temp.add(s);
            }
            res.add(temp);
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board,row,j,n)){
                board.set(row, board.get(row).substring(0, j) + 'Q'+ board.get(row).substring(j + 1));
                nQueens(board, row + 1, n, res);
                board.set(row, board.get(row).substring(0, j) + '.'+ board.get(row).substring(j + 1));
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<String>board = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringBuilder row = new StringBuilder();
            for(int j=0; j<n; j++){
                row.append('.');
            }
            board.add(row.toString());
        }
        List<List<String>>res = new ArrayList<>();
        nQueens(board,0,n,res);
        return res;
    }
}