class Subset{
    public static void subsets(String str,String ans,int i){
        //base 
        if(i==str.length()){
           System.out.println(ans);
           return;
        }
        //yes
        subsets(str, ans+str.charAt(i), i+1);
        //no
        subsets(str, ans, i+1);
    }
    public static  void perm(String str,String ans){
        //base
        if( str.length() == 0){
            System.out.println(ans);
            return;
        }
        //rec
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String newstr =  str.substring(0,i)+str.substring(i+1);
            perm(newstr, ans+curr);
        }
    }
    //  public static void subsetsint(int arr[], ArrayList<Integer> ansarr, int i) {

    //     // base case
    //     if (i == arr.length) {
    //         System.out.println(ansarr);
    //         return;
    //     }

    //     ansarr.add(arr[i]);
    //     subsetsint(arr, ansarr, i + 1);
    //      ansarr.remove(ansarr.size() - 1);
    //     subsetsint(arr, ansarr, i + 1);
    // }
    public static void main(String [] args){
        String str = "abc";
        String ans =" ";
        //  int arr[] = {1, 2, 3, 5};
        // ArrayList<Integer> ansarr = new ArrayList<>();
        // subsetsint(arr, ansarr, 0);
        // subsets(str, ans, 0);
        perm(str, ans);
    }
}