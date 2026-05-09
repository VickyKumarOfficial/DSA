// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFAPPS

import java.util.Scanner;

public class Chef_and_his_Appa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int s = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		    int currentFree = s - (x + y);
            if (currentFree >= z) System.out.println(0);
            else if (currentFree + x >= z || currentFree + y >= z) System.out.println(1);
            else System.out.println(2);
		}
        sc.close();
    }
}
