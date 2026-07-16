class binarysearch{
    static int bserach(int arr[],int n,int target){
        int start = 0 ,end =n-1;
        while (start<=end){
          int  mid = (start+end)/2;
          if(arr[mid] == target){
            return mid;
          } 
          if (arr[mid] < target){
            start = mid+1;
          }else{
            end = mid-1;
          }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int n=arr.length;
        int target = 4;
        System.out.println(bserach(arr, n, target));
    }
}