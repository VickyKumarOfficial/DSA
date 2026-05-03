// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MAXTASTE

import java.util.Scanner;

public class Maximise_the_Tastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		    int fl, sl;
		    if(a > b) fl = a;
		    else fl = b;
		    if(c > d) sl = c;
			else sl = d;
		    System.out.println(fl + sl);
		}
        sc.close();
    }
}
