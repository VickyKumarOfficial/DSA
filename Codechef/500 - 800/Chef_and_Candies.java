// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFCAND

import java.util.Scanner;

class Chef_and_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int n = sc.nextInt(), x = sc.nextInt();
		    if(n <= x) System.out.println(0);
		    else { 
		      //  int left = ;
		        System.out.println((int)Math.ceil((n - x) / 4.0));
		    }
		    t--;
		}
		
		sc.close();
    }    
}
