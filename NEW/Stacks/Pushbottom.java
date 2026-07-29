import java.util.*;

public class Pushbottom{
    public static void pushlast(Stack <Integer> s , int Data){
        if(s.isEmpty()){
            pushlast(s, Data);
        }

        int top = s.pop();
        pushlast(s, Data);
        s.push(top);
    }
    public static void main(String [] args){
        Stack <Integer> s =  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);    
        pushlast(s,4);  
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }  
    }
}