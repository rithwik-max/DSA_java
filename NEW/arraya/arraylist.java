import java.util.*;
public class arraylist{
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       mainlist.add(list);
       ArrayList<Integer> list2= new ArrayList<>();
       list2.add(5);
       list2.add(6);
       list2.add(7);
       list2.add(8);
       mainlist.add(list2);
        ArrayList<Integer> list3= new ArrayList<>();
       list3.add(5);
       list3.add(6);
       list3.add(7);
       list3.add(8);
       mainlist.add(list3);
        ArrayList<Integer> list4= new ArrayList<>();
       list4.add(5);
       list4.add(6);
       list4.add(7);
       list4.add(8);
       mainlist.add(list4);
       for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer> curr = mainlist.get(i);
        for(int j=0;j<curr.size();j++){
            System.out.print(curr.get(j)+" ");
        }
            System.out.println(" ");
       }
    }
}