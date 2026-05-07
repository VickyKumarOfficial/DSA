// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/BLACKJACK

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt(), x = sc.nextInt(), flag = 0, i;
		    for(i = 1; i <= 10; i++) {
		        if(n+x+i == 21) {
		            flag++;
		            break;
		        }
		    }
		    if(flag != 0) System.out.println(i);
		    else System.out.println(-1);
		}
        sc.close();
    }
}
