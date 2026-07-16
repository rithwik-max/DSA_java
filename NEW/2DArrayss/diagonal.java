class diagonal{
    public static void diagonaltravs(int [][] mat,int n){
        for(int col=0;col<n;col++){
            int i=0,j=col;
            while(i<n && j>=0){
                System.out.print(mat[i][j]+" ");
                i++;
                j--;
            }
        }
        for(int row=1;row<n;row++){
            int i=row,j=n-1;
            while(i<n && j>=0){
                System.out.print(mat[i][j]+" ");
                i++;
                j--;
            }
        }
    } 
    public static void magicsquare(int [][] mat){
        
    }
    public static void main(String[] args) {
      int[][] mat = {{2,7,6},{9,5,1},{4,3,8}};
        int n = mat.length;
        
    }
}