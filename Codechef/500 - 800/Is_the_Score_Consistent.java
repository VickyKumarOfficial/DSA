// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/THREETOPICS

import java.util.Scanner;

class Is_the_Score_Consistent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
    		int a = sc.nextInt(), b = sc.nextInt();
    		int c = sc.nextInt(), d = sc.nextInt();
    		if(c < a || d < b) System.out.println("IMPOSSIBLE");
    		else System.out.println("POSSIBLE");
		}
		
		sc.close();
    }
}
