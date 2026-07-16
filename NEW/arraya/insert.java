class insert{
    public static int insertion(int arr[],int n,int k){
        int st = 0;
        int ed=n-1;
        while(st<=ed){
            int mid = st + (ed-st)/2;
            if(arr[mid] == k){
                return mid;
            }else if(k>arr[mid]){
                st = mid+1;
            }else{
                ed = mid-1;
            }
        }
        return ed;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 10, 11, 11, 25};
        int n= arr.length;
        int k=9;
        System.out.print(insertion(arr, n, k));
    }
}