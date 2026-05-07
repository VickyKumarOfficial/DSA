// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/LASTLEVELS

import java.util.*;

public class The_Last_Levels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		    int tot_t = x*y;
		    if(x <= 3) System.out.println(tot_t);
		    else {
		        int brks = (x-1)/3;
		        brks = (brks * z) + tot_t;
		        System.out.println(brks);
		    }
		}
        sc.close();
    }
}