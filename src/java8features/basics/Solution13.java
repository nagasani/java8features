package java8features.basics;

class Solution13 {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] seq =new int[P.length];
        char[] c = S.toCharArray();
        for(int i=0;i<P.length;i++){
            int min=5;
            
            for(int j=P[i]; j<=Q[i]; j++){
                int current=0;
                if(c[j]=='A'){
                    current = 1;
                    seq[i]=1;
                    min = 1;
                    break;
                }
                else if(c[j]=='C'){
                    current = 2;
                }
                else if(c[j]=='G'){
                    current = 3;
                }
                else if(c[j]=='T'){
                    current = 4;
                }
                if(current < min)
                {
                    min= current;
                }
                //System.out.println(min);
            }
             //System.out.println("Done");
            if(min!=1)
            {
                seq[i]=min;
            }
        }
        //System.out.println(seq);
        return seq;
    }
}