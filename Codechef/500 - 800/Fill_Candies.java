// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FILLCANDIES?tab=statement

import java.util.*;

public class Fill_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), k = sc.nextInt(), m = sc.nextInt(), c = 0, cap = m*k;
		    while (n > 0) {
		        n = n - cap;
		        c++;
		    }
		    System.out.println(c);
		}
        sc.close();
    }
}