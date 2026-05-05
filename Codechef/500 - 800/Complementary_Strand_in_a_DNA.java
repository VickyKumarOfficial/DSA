// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/DNASTRAND

import java.util.*;
public class Complementary_Strand_in_a_DNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt();
            String S = sc.next();
            for(int i = 0; i < n; i++) {
                if(S.charAt(i) == 'A') System.out.print("T");
                else if(S.charAt(i) == 'T') System.out.print("A");
                else if(S.charAt(i) == 'G') System.out.print("C");
                else if(S.charAt(i) == 'C') System.out.print("G");
            } System.out.println();
		}
        sc.close();
    }
}
