 class largest{
    public static void main (String args []){
        int arr [] ={1,2,3,5,7,4,0,66};
        int max=Integer.MIN_VALUE;
        int max_s=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
           if(max<arr[i]){
            max_s = max;
            max=arr[i];
           }
           else if(arr[i] > max_s && arr[i] != max){
            max_s = arr[i];
           }

        }
          System.out.println(max_s);
    }
}