// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/QUALIFY

import java.util.Scanner;

class Qualify_the_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		    if((a + b*2) >= x) System.out.println("Qualify");
		    else System.out.println("NotQualify");
		}
		
		sc.close();
    }    
}
