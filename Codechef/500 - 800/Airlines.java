// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SPCP2

import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), n = sc.nextInt(), rem = 0, ans = 0;
            rem = n / 100;
            if(x > rem) System.out.println(0);
		    else if(n%100 == 0) {
		        ans = n/100;
		        System.out.println(Math.abs(ans-x));
		    }
		    else {
		        ans = (n/100) + 1;
		        System.out.println(Math.abs(ans-x));
		    }
		}
        sc.close();
    }
}
