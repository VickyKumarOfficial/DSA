// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/XJUMP

import java.util.Scanner;

public class X_Jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), y = sc.nextInt();
		    if(y > x) System.out.println(x);
		    else System.out.println((x/y) + (x%y));
		}
        sc.close();
    }
}
