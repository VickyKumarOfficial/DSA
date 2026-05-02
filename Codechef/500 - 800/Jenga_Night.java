// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/JENGA

import java.util.Scanner;

public class Jenga_Night {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), x = sc.nextInt();
		    if((n <= x) && (x % n == 0)) System.out.println("Yes");
		    else System.out.println("No");  
		}
        sc.close();
    }
}
