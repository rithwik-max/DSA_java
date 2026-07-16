class circularsubarray{
    public static int maxcircularsubarray(int arr[],int n){
        int res = arr[0];
        for(int i=0;i<n;i++){
            int curr= 0;
            for(int j=0;j<n;j++){
                int idx = (i+j)%n;
                curr = curr+arr[idx];
                res = Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        int n= arr.length;
        System.out.print(maxcircularsubarray(arr, n));
    }
}