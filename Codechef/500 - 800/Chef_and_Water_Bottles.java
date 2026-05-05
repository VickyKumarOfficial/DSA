// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFBOTTLE

import java.util.*;

public class Chef_and_Water_Bottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), x = sc.nextInt(), k = sc.nextInt();
		    if(n*x <= k) System.out.println(n);
		    else System.out.println(k/x);
		}
        sc.close();
    }
}
