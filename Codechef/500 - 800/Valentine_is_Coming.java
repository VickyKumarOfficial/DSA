// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/VALENTINE

import java.util.Scanner;

public class Valentine_is_Coming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), y = sc.nextInt();
		    System.out.println(x/y);
		}
        sc.close();
    }
}
