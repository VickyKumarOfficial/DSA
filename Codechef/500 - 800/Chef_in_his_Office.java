// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/OFFICE

import java.util.Scanner;

class Chef_in_his_Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0) {
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println((x*4)+y);

            t--;
        }

        sc.close();
    }
}
