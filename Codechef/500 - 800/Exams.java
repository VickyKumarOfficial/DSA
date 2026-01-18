// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/EXAMCHEF

import java.util.Scanner;

class Exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0) {
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            int total = x*y/2;
            if(total < z) System.out.println("Yes");
            else System.out.println("No");

            t--;
        }
        sc.close();
    }
}
