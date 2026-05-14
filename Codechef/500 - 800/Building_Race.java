// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/BUILDINGRACE?tab=statement

import java.util.Scanner;

public class Building_Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            double s1 = (double) a/x; 
            double s2 = (double) b/y;
            if(s1 == s2) System.out.println("Both");
            else if(s2 < s1) System.out.println("Chefina");
            else System.out.println("Chef");
		}
        sc.close();
    }
}
