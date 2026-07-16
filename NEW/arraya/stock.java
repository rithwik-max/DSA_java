class  stock{
    public static int stockbuy(int arr[],int n){
        int maxprofit=0;
        int buyprice = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(buyprice<arr[i]){
                int profit = arr[i]-buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice=arr[i];
            }
        }
        return maxprofit;
    }
    public static int maxstockbut(int arr[],int n){
        int max=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                max+=arr[i]-arr[i-1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = arr.length; 
        System.out.println(maxstockbut(arr, n));
    }
}