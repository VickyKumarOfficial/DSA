// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/ELECTN

import java.util.Scanner;

class Elections_in_Chefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), x = sc.nextInt(), c = 0;
		    for(int i = 1; i <= n; i++) {
		        int voters = sc.nextInt();
		        if(voters >= x) c++;
		    }
		    System.out.println(c);
		}
		
		sc.close();
    }    
}
