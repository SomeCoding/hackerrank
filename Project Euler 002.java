import java.util.*;

public class Solution {
    
    public static long sumFib (long n){
        
        long sum = 10;
        long[] fVal = {5, 8};
        long fValLast;

        while (true) {

            fValLast = fVal[0] + fVal[1];
            fVal[0] = fVal[1];
            fVal[1] = fValLast;

            if (fValLast >= n) break;

            if (fValLast%2 == 0) sum += fValLast;
        }
        return sum;
     }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            long n = in.nextLong();
            System.out.println(sumFib(n));
        }
    }
}
