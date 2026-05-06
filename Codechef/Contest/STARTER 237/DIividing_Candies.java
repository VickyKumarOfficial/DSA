// https://www.codechef.com/START237D/problems/DIVKIDS

import java.util.*;

public class DIividing_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), x = sc.nextInt();
		    int[] jar = new int[n];
		    
		    for(int i = 0; i < n; i++) jar[i] = sc.nextInt();
		    
		    int max = 0;
		    for(int i = 0; i < n; i++) {
		        if(jar[i]%x == 0) {
		            if(jar[i] > max) {
		                max = jar[i];
		            }
		        }
		    } 
            System.out.println(max);
		}
        sc.close();
    }
}
