// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SALESEASON

import java.util.Scanner;

class Sale_Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int x = sc.nextInt();
		    if(x <= 100) System.out.println(x);
		    else if(x > 100 && x <= 1000) System.out.println(x-25);
		    else if(x > 1000 && x <= 5000) System.out.println(x-100);
		    else System.out.println(x-500);
		    
		    t--;
		}
		
		sc.close();
    }
}
