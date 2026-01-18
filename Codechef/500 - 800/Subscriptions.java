// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SUBSCRIBE_

import java.util.*;
import java.util.Scanner;
class Subscriptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0) {
            int n = sc.nextInt(), x = sc.nextInt();
            double z = Math.ceil(n/6.0);
            System.out.println((int)z*x);

            t--;
        }
    }
}
