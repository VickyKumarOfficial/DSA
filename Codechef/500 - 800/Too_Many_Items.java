// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/POLYBAGS

import java.util.Scanner;

public class Too_Many_Items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt(), c = 0, item = 0;
            while(true) {
                item += 10;
                c++;
                if(item >= n) break;
            }
            System.out.println(c);
        }
        sc.close();
    }    
}
