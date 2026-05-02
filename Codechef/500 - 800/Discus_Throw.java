// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/DISCUS

import java.util.Scanner;

public class Discus_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		    if((a >= b) && (a >= c)) System.out.println(a);
		    else if((b >= c) && (b >= a)) System.out.println(b);
		    else if((c >= b) && (c >= a)) System.out.println(c);
		    else System.out.println(a);
		} 
        sc.close();
    }
}
