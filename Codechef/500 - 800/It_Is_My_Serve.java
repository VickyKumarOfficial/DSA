// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MYSERVE?tab=statement

import java.util.*;

public class It_Is_My_Serve{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int p = sc.nextInt(), q = sc.nextInt();
		    int sum = p+q;
		    if((p+q+1)<2) System.out.println("Alice");
		    else {
		        if((((p+q+1)%4)==1)||(((p+q+1)%4)==2)) System.out.println("Alice");
		        else System.out.println("Bob");
		    }
		}
        sc.close();
    }
}