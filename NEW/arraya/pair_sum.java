import java.util.*;
public class pair_sum {
    public static void sum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int left = bp + 1; 
        int right = bp;    
        while (left != right) {
            int curr = list.get(left) + list.get(right);
            if (curr == target) {
                System.out.println("Pair found at index: "
                        + left + " and " + right);
                return;
            }
            if (curr < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        System.out.println("Pair not found");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(15);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        sum(list, 16);
    }
}