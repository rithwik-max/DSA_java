class bubblesort{
    public static void bubble(int arr[],int n){
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selecion(int arr[],int n) {
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n-1;j++){
                if(arr[min]>arr[j]){
                   min = j;
                }
            }
             int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] =  temp;
        }
    }
    // public  static void inserction(int arr[],int n){
    //     for(int i=1;i<n;i++){
    //         int curr = i;
    //         int prev = i-1;
    //       while(arr[prev] >= 0 && arr[curr] );
    // }
    public static int search(int arr[][],int key ){
        int count = 0;
       for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
             if(arr[i][j]==key){
             count++;
          
           }
         }
       }
      return count;
    }
    public static int sum(int arr[][] ){
        int sum = 0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[1][i];
      }
      return sum;
    }
    public static void trans(int arr[][]){
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println(" ");
       }
    }
    public static void even (int num){
      if((num & 1) == 1){
        System.out.println("odd");
      }else{
        System.out.println("even");
      }
    }
 public static void main(String[] args) {
    //  int arr[][] = {{1,4,9},{11,4,3},{2,2,3} };
    //  trans(arr);
     even(5);


    // System.out.println( sum(arr));
    //  int  key =7;
    // System.out.println(search(arr, key)); 
//      int n= arr.length;
//      selecion(arr, n);
//      for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]);
//      }
}
}