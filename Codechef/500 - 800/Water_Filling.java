// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WATERFILLING

import java.util.Scanner;

class Water_Filling {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int b1 = sc.nextInt(), b2 = sc.nextInt(), b3 = sc.nextInt();
		    if((b1 == 0 && b2 == 0) || (b1 == 0 && b3 == 0) || (b2 == 0 && b3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0)) System.out.println("Water filling time");
		    else System.out.println("Not now");
		    
		    t--;
		}
		
		sc.close();

	}
}
