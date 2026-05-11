// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CRICUP

import java.util.*;

public class Cup_Finals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), y = sc.nextInt(), d = sc.nextInt();
		    int diff = Math.abs(x-y);
		    if(diff <= d) System.out.println("YES");
		    else System.out.println("NO");
		}
        sc.close();
    }
}