// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FLOW017?tab=statement

import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		  //  int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		    int[] arr = new int[3];
		    for(int i = 0; i < 3; i++) arr[i] = sc.nextInt();
		    int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
		    for(int i = 0; i < 3; i++) {
		        if(max < arr[i]) {
		            smax = max;
		            max = arr[i];
		        }
		        else if(max != arr[i] && smax < arr[i]) smax = arr[i];
		    }
		    System.out.println(smax);
		}
        sc.close();
    }
}
