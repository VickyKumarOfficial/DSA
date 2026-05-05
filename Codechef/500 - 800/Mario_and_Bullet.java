// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/BULLET

import java.util.*;

public class Mario_and_Bullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		    int sec = y/x; // Bullet take 'sec' to reach target
		    int fire = z - sec;
		    if(fire <= 0) System.out.println("0");
		    else System.out.println(fire);   
		} sc.close();
    }

}
