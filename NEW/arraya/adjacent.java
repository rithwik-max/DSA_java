class adjacent{
    public static void adjacentreplace(int nums[],int res[]){
        
     for(int i=0;i<nums.length;i++){
       if(i==0){
        res[i]=nums[i]*nums[i+1];
       }
       else if(i==nums.length-1){
            res[i]=nums[i-1]*nums[i];
     }else{
        res[i]=nums[i-1]*nums[i]*nums[i+1];
     }
     }
     for(int i=0;i<nums.length;i++){
        System.out.println(res[i]);
     }
    }
    public static void main(String[] args) {
        int nums[]={2,4,5};
        int res [] = new int[nums.length];
        adjacentreplace(nums,res);
        
    }
}
