// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TODOLIST

import java.util.Scanner;

class Problems_in_your_to_do_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int count = 0, rate = 999;
            for(int i = 1; i <= n; i++) {
                int pr = sc.nextInt();
                if(pr > rate) count++;
            }
            System.out.println(count);
        }
        
        sc.close();
    }    
}
