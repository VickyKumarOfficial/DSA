// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FSQRT

import java.util.*;

public class Finding_Square_Roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt();
		    double root = Math.sqrt(n);
		    System.out.println((int)root);
		}
		sc.close();
    }
}