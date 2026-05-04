// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/BATH

import java.util.*;

public class Bath_in_Winters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), y = sc.nextInt()*2;
		    System.out.println(x/y);
		}
        sc.close();
    }
}