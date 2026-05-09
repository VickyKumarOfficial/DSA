// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WTRMIXING

import java.util.Scanner;

public class Water_Mixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		    int diff = a-b;
		    if(a == b) System.out.println("YES");
		    else if(diff < 0) {
		        diff = Math.abs(diff);
		        if(diff <= x) System.out.println("Yes");
		        else System.out.println("NO");
		    }
		    else {
		        if(diff <= y) System.out.println("YES");
		        else System.out.println("NO");
		    }
		}
        sc.close();
    }
}
