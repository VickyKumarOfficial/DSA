// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CYCLICQD

import java.util.Scanner;

public class Cyclic_Quadilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		    if((a+c == 180) && (b+d == 180)) System.out.println("YES");
		    else System.out.println("NO");
		}
        sc.close();
    }
}
