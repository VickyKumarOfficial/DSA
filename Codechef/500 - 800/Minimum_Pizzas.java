// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MINPIZZA

import java.util.Scanner;

class Minimum_Pizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int n = sc.nextInt(), y = sc.nextInt();
		    int slices = n * y;
		    System.out.println((int)Math.ceil(slices/4.0));
		    
		    t--;
		}
		
		sc.close();
    }    
}
