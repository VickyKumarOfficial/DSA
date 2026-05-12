// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AORB

import java.util.Scanner;

public class A_or_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), y = sc.nextInt();
		    int am1 = 500 - (x*2);
		    int bm1 = 1000 - ((x+y)*4);
		    int am2 = 1000 - (y*4);
		    int bm2 = 500 - ((x+y)*2);
		    int m1 = am1 + bm1;
		    int m2 = am2 + bm2;
		    if(m1 > m2) System.out.println(m1);
		    else System.out.println(m2);
		}
        sc.close();
    }
}
