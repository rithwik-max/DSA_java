import java.util.*;
public class Monotonic {
    public static boolean mono(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        int left = 0;
        int right = 1;
        while (right < list.size()) {
            if (list.get(left) > list.get(right)) {
                inc = false;
            }
            if (list.get(left) < list.get(right)) {
                dec = false;
            }
            left++;
            right++;
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(mono(list));
    }
}