public class serach{
    public static boolean serachelement(int [][] mat,int k ,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int[][] mat = {
            {1, 5, 9},
            {14, 20, 21},
            {30, 34, 43}
        };
        int n = mat.length;
        int  k = 14;
        System.out.println(serachelement(mat, k, n));
    }
}