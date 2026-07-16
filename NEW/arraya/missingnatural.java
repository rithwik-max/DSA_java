class missingnatural{
    public static  int missingnaturals(int arr[],int n,int t){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int t = 2;
        int n= arr.length;
        System.out.println(missingnaturals(arr, n, t));
    }
}