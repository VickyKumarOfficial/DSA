// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFEREN

import java.util.*;

public class Chef_Eren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), sum = 0;
		    for(int i = 1; i <= n; i++) {
		        if(i%2 == 0) sum += a;
		        else sum += b;
		    }
		    System.out.println(sum);
		}
        sc.close();
    }
}