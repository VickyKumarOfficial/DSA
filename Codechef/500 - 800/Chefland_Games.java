// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFGAMES

import java.util.Scanner;

class Chefland_Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int r1 = sc.nextInt(), r2 = sc.nextInt(), r3 = sc.nextInt(), r4 = sc.nextInt();
		    if((r1 == 0) && (r2 == 0) && (r3 == 0) && (r4 == 0)) System.out.println("IN");
		    else System.out.println("OUT");
		    
		    t--;
		}
		
		sc.close();
    }
}
