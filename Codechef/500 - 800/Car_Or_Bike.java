// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TRAVELFAST

import java.util.Scanner;

class Car_Or_Bike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t != 0) {
	        int x = sc.nextInt(), y = sc.nextInt();
	        if(x < y) System.out.println("BIKE");
	        else if(x > y) System.out.println("CAR");
	        else System.out.println("SAME");
	        
	        t--;
	    }
	  
	    sc.close();
    }    
}
