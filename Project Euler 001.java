import java.util.*;
public class Solution {

    static long calculate (long n){

        long nOf3 = (n-1)/3;
        long sumOf3 = 3*nOf3*(nOf3+1)/2;

        long nOf5 = (n-1)/5;
        long sumOf5 = 5*nOf5*(nOf5+1)/2;

        long nOf15 = (n-1)/15;
        long sumOf15 = 15*nOf15*(nOf15+1)/2;

        long result = (sumOf3 + sumOf5 - sumOf15);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            long n = in.nextLong();
            System.out.println(calculate(n));
        }
        in.close();
    }
}