
import com.sun.source.doctree.ReturnTree;

class floorandceil{
    public  static  int floordinder(int [] arr,int x){
        int low=0,high=arr.length-1, ans=-1;
        while(low<=high){
          int  mid = low+(high-low)/2;
            if(arr[mid]<=x){
                ans =arr[ mid ];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public  static  int ceilfinder(int [] arr,int x){
        int low=0,high=arr.length-1, ans=-1;
        while(low<=high){
          int  mid = low+(high-low)/2;
            if(arr[mid]>=x){
                ans =arr[ mid ];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public int floorandceilfinder(int[]arr,int x){
        int f=  floorandceilfinder(arr, x);
        int c= ceilfinder(arr, x);
        return new int[]{f,c};
    }
    public static void main (String [] args){
            int arr []={3,4,4,7,8,10};
            int x=5;
    }
}