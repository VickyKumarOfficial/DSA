// https://www.codechef.com/START238D/problems/CRNET

import java.util.*;

public class Cricket_Nets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt(), tot = 1;
		    if(x <= 20) {
		        x *= 10;
		        System.out.println(x);
		    }
		    else {
		        tot = 200 + ((x-20)*5)/2;
		        System.out.println(tot);
		    }
		}
        sc.close();
    }
}
