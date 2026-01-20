// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/HELIUM3

import java.util.Scanner;

class Chef_and_Nextgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		    if (x * y >= a * b) System.out.println("Yes");
		    else System.out.println("No");
		    
		    t--;
		}
		
		sc.close();
    }    
}
