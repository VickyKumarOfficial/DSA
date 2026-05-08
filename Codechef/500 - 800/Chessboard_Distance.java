// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHESSDIST

import java.util.Scanner;

public class Chessboard_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
		    int p1 = Math.abs(x1-x2);
		    int p2 = Math.abs(y1-y2);
		    if(p1 >= p2) System.out.println(p1);
		    else System.out.println(p2);
		    
		}
        sc.close();
    }
}
