// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FLOORS?tab=statement

import java.util.*;

public class Too_Many_Floors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), y = sc.nextInt();
		    int fl1 = ((x-1)/10)+1;
		    int fl2 = ((y-1)/10)+1;
		    int d = Math.abs(fl1 - fl2);
		    if(d == 0) System.out.println(0);
		    else System.out.println(d);
		}
        sc.close();
    }
}