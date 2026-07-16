class  arrange{
    public static void arrangelements(int [] arr,int temp[],int nums[],int n){
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[i]=arr[i];
            }else{
                nums[i]=arr[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0 || temp[i]!=0){
            System.out.print(nums[i]+","+temp[i]);
            }
        }
       
    }
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, -4, -1, 4};
       int n = arr.length;
       int temp[]=new int[n];
       int nums[]=new int[n];
       arrangelements(arr, temp, nums, n);
       
    }
}