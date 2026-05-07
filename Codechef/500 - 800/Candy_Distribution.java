// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CANDYDIST

import java.util.Scanner;

public class Candy_Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), m = sc.nextInt(), q;
		    q = n/m;
		    if(q%2 == 0 && n%m == 0) System.out.println("Yes");
		    else System.out.println("No");
		}
        sc.close();
    }    
}
