// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MINCOINS

import java.util.Scanner;

public class Minimum_Number_of_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt();
		    if(n%5 != 0) System.out.println(-1);
		    else {
		        int ans = (n/10) + ((n%10)/5);
		        System.out.println(ans);
		    }
		}
        sc.close();
    }
}
