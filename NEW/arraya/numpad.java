
public class numpad {

    static String[] keypad = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };

    public static void mapping(String digits,
                               int idx,
                               String ans) {

        // base
        if (idx == digits.length()) {

            System.out.println(ans);
            return;
        }

        // current digit
        int curr = digits.charAt(idx) - '0';

        String map = keypad[curr];

        // recursion
        for (int i = 0; i < map.length(); i++) {

            mapping(digits,
                    idx + 1,
                    ans + map.charAt(i));
        }
    }

    public static void main(String[] args) {

        String digits = "23";

        mapping(digits, 0, "");
    }
}