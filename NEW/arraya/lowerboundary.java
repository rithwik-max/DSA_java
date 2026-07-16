class lowerboundary{
   public static int lower(int arr[],int target){
    int si=  0;
    int end=arr.length-1;
    int res=arr.length;
    while(si<=end){
        int mid =  si + (end-si)/2;
        if(arr[mid]>=target){
            res =  mid;
            end=mid-1;
        }else {
            si=mid+1;
        }
    }
    return res;
   }
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;
        System.out.println(lower(arr, target));
    }
}