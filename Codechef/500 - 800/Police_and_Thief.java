// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/POLTHIEF

import java.util.*;

public class Police_and_Thief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    System.out.println(Math.abs(x-y));
		}
        sc.close();
    }
}
