// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SELFDEF

import java.util.Scanner;

public class Self_Defence_Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), count = 0;
		    int[] w = new int[n];
		    for(int i = 0; i < n; i++) w[i] = sc.nextInt();
		    for(int i = 0; i < n; i++) if((w[i] >= 10) && (w[i] <= 60)) count++;
		    System.out.println(count);
		}
        sc.close();
    }
}
