
class inscresing {

    public static void inc(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }

        System.out.print(n + " ");

        inc(n - 1);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        
        int h =  n*fact(n-1);
        return h;
    }
    public static int sum(int n){
       if(n == 1){
        return 1;
       }
       int h =n+sum(n-1);
       return h;
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
        return  fib(n-1)+fib(n-2);
    }
    public static boolean sort(int arr[] ,int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(arr, i+1);
    }
    public static int last(int arr[],int key, int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return  last(arr, key, i-1);
    }
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int arr[] = {2,3,4,5,6,7,8,3,3};
        int i = arr.length-1;
        System.out.println(last(arr,3,i));
        // inc(n);
    }
}