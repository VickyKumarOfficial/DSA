// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WGHTS

import java.util.*;

public class Weights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int w = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		    if(x+y+z == w || x+y == w || y+z == w || x+z == w || x == w || y == w || z == w) System.out.println("YES");
		    else System.out.println("NO");
		    
		}
        sc.close();
    }    
}
