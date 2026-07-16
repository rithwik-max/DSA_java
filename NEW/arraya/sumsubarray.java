class sumsubarray{
    public static int sumsub(int [] arr,int n){
        int temp=0;
        int maxsum=0;
        for(int i=0;i<n;i++){
            temp=0;
            for(int j=i;j<n;j++){
                temp += arr[j];
                maxsum += temp;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int  arr[] = {1, 4, 5, 3, 2};
        int n = arr.length;
        System.out.println(sumsub(arr, n));
    }
}