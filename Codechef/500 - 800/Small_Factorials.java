// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FCTRL2

import java.util.*;

public class Small_Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++){
		    long n = sc.nextLong(), fact = 1;
		    while(n > 0) {
		        fact *= n;
		        n--;
		    }
		    System.out.println(fact);
		}
        sc.close();
    }
}
