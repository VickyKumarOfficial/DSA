// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MONOPOLY2

import java.util.Scanner;

class Monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt(), s = sc.nextInt();
            if((p > q + r + s) || (q > p + r + s) || (r > p + q + s) || (s > p + q + r)) System.err.println("Yes");
            else System.err.println("No"); 
        }

        sc.close();
    }
}
