// https://www.codechef.com/START238D/problems/TESTTGT

import java.util.*;

public class Test_Match_Target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		int aus = x + z;
		int diff = aus - y;
		if(y > aus) System.out.println(0);
		else System.out.println(diff+1);
        
        sc.close();
    }    
}
