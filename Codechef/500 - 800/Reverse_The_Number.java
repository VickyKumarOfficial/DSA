// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FLOW007

import java.util.Scanner;

class Reverse_The_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt();
		    int temp = 0, rev = 0;
		    while(n != 0) {
		        temp = n % 10;
		        rev = temp + rev*10;
		        n /= 10;
		    }
		    System.out.println(rev);
		}
		
		sc.close();
    }
}
