// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SST?tab=statement

import java.util.Scanner;

class Sasta_Shark_Tank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int a = sc.nextInt(), b = sc.nextInt();
		    if(10 * a > 5 * b) System.out.println("First");
		    else if(10 * a < 5 * b) System.out.println("Second");
		    else System.out.println("Any");
		}
		
		sc.close();
    }    
}
