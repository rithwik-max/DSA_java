import java.util.*;
public class lonely{
    public static  void lonelynum(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
           int n=list.get(i);
           int m=list.get(i+1);
           if(n == m && n+1==m && n-1==m ){
                System.out.println(n);
           }
           
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5); 
        list.add(8);
        System.out.println(lonelynum(list));
    }
}