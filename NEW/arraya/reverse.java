public class reverse{
     static void reverse(int arr[],int n){
        int start =0, end =n-1;
        while(start < end){
            int temp =  arr[end];
            arr[end] = arr[start];
            arr[start] =  temp;
            start++;
            end--;
        }
    }
    static void pairs(int arr[],int  n){
        int tp=0;
        for(int i=0;i<n;i++){
            int curr = arr[i];
                for(int j=i+1;j<n;j++){
                    System.out.print("["+"(" +curr+","+arr[j]+")"+"="+curr+arr[j]+"]");
                    tp++;
                }
                System.out.println(" ");
        }
        System.out.println(tp);
    }
    static void subarray(int arr[],int n){
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                for(int k=start ;k <=end ;k++){
                    System.out.print(arr[k]);
                }
                System.out.println("");
            }
        }
    }
    static void maxsum(int arr[],int n){
        int curr = 0;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end =j;
                curr =0;
                for(int k=start;k<=end;k++){
                curr += arr[k];
            }
            if(curr>max){
                max = curr;
            }
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int n=arr.length;
        // reverse(arr, n);
        // pairs(arr, n);
        // subarray(arr, n);
        maxsum(arr, n);

       
        
        
    }
}