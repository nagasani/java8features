package java8features.basics;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution15 {
    public int solution(String S) {
        // write your code in Java SE 8
        char[] a = S.toCharArray();
        int shuru=0;
        int k=0;
        boolean startedMatching = false;
        for(int i=0; i<a.length;i++){
            if(!startedMatching){
                if(a[i] == '{' || a[i] == '[' || a[i] == '('){
                    continue;
                }
                else
                {
                    shuru=i;
                    startedMatching = true;
                }
            }  
            else{
                if(shuru != 0)
                {

                    System.out.println(a[i-k-1]+" : "+a[i]);
                    if(a[i] == '}' && a[i-k-1]=='{'){
                        return 0;
                    }
                    if(a[i] == ')' && a[i-k-1]=='('){
                        return 0;
                    }
                    if(a[i] == ']' && a[i-k-1]=='['){
                        return 0;
                    }
                    k--;
                }
            }
        }


        return 1;
    }
}
