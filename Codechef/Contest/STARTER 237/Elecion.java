// https://www.codechef.com/START237D/problems/ELECTION1

import java.util.*;

public class Elecion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    if((n/2) + 1 < x) System.out.println(0);
	    else System.out.println((n/2)+1 - x);
        sc.close();
    } 
}
