class same{
    public static  boolean comp(String s1,String s2){
           if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void palindrome(String s1){
        int left=0;
        int right = s1.length()-1;
        while(left < right){
            if(s1.charAt(left)!=s1.charAt(right)){
                System.out.print("This is not a palindrome");
            }
            left++;
            right--;
        }
         System.out.println("This is not a palindrome");
    }
    public static void main(String[] args) {
        String s1="GeeksforGeeks";
       palindrome(s1);
    }
}