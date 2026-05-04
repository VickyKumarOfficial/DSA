// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FINDSHOES

import java.util.*;

public class Finding_Shoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), m = sc.nextInt();
		    if(n <= m) System.out.println(n);
		    else System.out.println(n + (n - m));   
		}
        sc.close();
    }
}
