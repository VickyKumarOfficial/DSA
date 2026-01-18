// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AMR15A

import java.util.Scanner;

class Mahasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w, luck = 1, unluck = 1;
		for(int i = 1; i <= n; i++) {
		    w = sc.nextInt();
		    if(w % 2 == 0) luck++;
		    else unluck++;
		} 
		if(luck > unluck) System.out.println("READY FOR BATTLE");
		else System.out.println("NOT READY");

        sc.close();
    }    
}
