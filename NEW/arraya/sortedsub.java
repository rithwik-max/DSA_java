import java.util.*;
class sortedsub{
    public static void sortedsubsequence(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i] * arr[j] == arr[k]){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }
    public static void  main(String [] args){
        int arr[]={1,2,3,4};

        int n=arr.length;
        sortedsubsequence(arr,n);
    }
}