// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AVGPROBLEM?tab=statement

import java.util.*;
import java.util.Scanner;
class Greater_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if((a+b)/2.0 > c) System.out.println("Yes");
            else System.out.println("NO");

            t--;
        }
    }
}
