class increasing_sub{
    public static int increasing_substring(int [] arr, int  n){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j-1]>=arr[j]){
                    break;
                }
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 3, 7, 9};
        int n = arr.length;
        System.err.println(increasing_substring(arr, n));
    }
}