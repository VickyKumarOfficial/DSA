// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/NEARESTEXIT

import java.util.Scanner;

class Nearest_Exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int x = sc.nextInt();
		    if(x <= 50) System.out.println("Left");
		    else System.out.println("Right");
		}
		
		sc.close();
    }
}
