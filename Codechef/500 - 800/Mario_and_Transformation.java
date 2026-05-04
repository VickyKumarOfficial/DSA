// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TRANSFORM

import java.util.*;

public class Mario_and_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt();
		    if(x == 0 || x % 3 == 0) System.out.println("NORMAL");
		    else if(x % 3 == 1) System.out.println("HUGE");
		    else System.out.println("SMALL");
		}
        sc.close();
    }
}