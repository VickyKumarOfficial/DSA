// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SPEEDTEST

import java.util.Scanner;

public class Speed_Limit_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0){
		    int a = sc.nextInt(), x = sc.nextInt(), b = sc.nextInt(), y = sc.nextInt();
		    double sp1 = (double)a/x;
		    double sp2 = (double)b/y;
		    if(sp1 == sp2) System.out.println("Equal");
		    else if(sp1 < sp2) System.out.println("Bob");
		    else System.out.println("Alice");
		}
        sc.close();
    }
}
