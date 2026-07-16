import java.util.*;

public class pairsum {

    public static void sum(ArrayList<Integer> list, int target) {

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            int curr = list.get(left) + list.get(right);

            if (curr == target) {
                System.out.println("Pair found at index: " + left + " and " + right);
                return;
            }

            if (curr < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Pair not found");
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(0);
        list.add(30);
        list.add(1000);
        list.add(50);
        list.add(200);

        sum(list, 1200);
    }
}