import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();

       System.out.println(mainTester(s));

    }

    public static int pretest (String s) {

        if (s.length() < 2) return 0;
        if (s.charAt(0) == s.charAt(1)) return 0;
        String doubleChar1 = String.valueOf(new StringBuilder().append(s.charAt(0)).append(s.charAt(0)));
        if (s.contains(doubleChar1)) return 0;
        String doubleChar2 = String.valueOf(new StringBuilder().append(s.charAt(1)).append(s.charAt(1)));
        if (s.contains(doubleChar2)) return 0;
        return s.length();
    }

    public static int mainTester (String s){

        int max = 0;
        if (s.length() < 2) return 0;
        if (s.length() == 2 ) return 2;
        TreeSet<Character> setCh = new TreeSet<>();
        for (int i = 0; i < s.length() ; i++) {
            setCh.add(s.charAt(i));
        }
        List<Character> uniSrt = setCh.stream().collect(Collectors.toList());
//        System.out.println(uniSrt);

        for (int j = 0; j < uniSrt.size(); j++) {
            for (int z = 0; z < uniSrt.size(); z++) {
                StringBuilder tmp = new StringBuilder();
                for (int i = 0; i < s.length() ; i++) {
                if (j != z && s.charAt(i) == uniSrt.get(j) || s.charAt(i) == uniSrt.get(z)) tmp.append(s.charAt(i));
                }
//            System.out.println(tmp.toString());
            if (max < pretest(tmp.toString())) max = pretest(tmp.toString());
            }
        }

        return max;
    }
}
