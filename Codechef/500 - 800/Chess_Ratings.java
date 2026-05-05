// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/C_RATING

import java.util.*;

public class Chess_Ratings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int c = 0;
		    int x = sc.nextInt(), y = sc.nextInt();
		    if(x == y) System.out.println(0);
		    else {
		        while(y >= x) {
		            x += 8;
		            c++;
		            if(x >= y) {
		                System.out.println(c);
		                break;
		            }
		        }
		    }
		}
        sc.close();
    }
}
