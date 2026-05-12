// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/PASSORFAIL

import java.util.Scanner;

public class Pass_or_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
    		int n = sc.nextInt(), x = sc.nextInt(), p = sc.nextInt();
    		int correct = x * 3;
    		int diff = n - x;
		    int tot = correct - diff;
		    if(tot >= p) System.out.println("PASS");
		    else System.out.println("FAIL");
		}
        sc.close();
    }
}
