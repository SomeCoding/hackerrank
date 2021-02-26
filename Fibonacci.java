import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static boolean split53(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        if (sum%2 != 0 ) return false;


        return splitChecker(0, nums, 0, 0);

    }

    public static boolean splitChecker(int start, int[] arr, int sumFirst, int sumSecond){

        if (start >= arr.length) return sumFirst == sumSecond;

        if (arr[start]%5 == 0) return splitChecker(start+1, arr, sumFirst + arr[start], sumSecond);
        if (arr[start]%3 == 0) return splitChecker(start+1, arr, sumFirst, sumSecond + arr[start]);

        return splitChecker(start+1, arr, sumFirst + arr[start], sumSecond) ||
                splitChecker(start+1, arr, sumFirst, sumSecond + arr[start]);
    }

    public static void main (String[] args) {


    int[] aArr = {3, 5, 8, 3, 5, 8};
    int[] bArr = {2, 3};

        String str = "textcatcowcattext";
        String str2 = "cat";

        int a = 0; int b = 14; int c = 5;

        boolean bool = false;

        System.out.println(split53(aArr));
//        System.out.println(Arrays.toString(front11(aArr, bArr)));
    }
}
