// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SUGARCANE?tab=statement

import java.util.Scanner;

class Sugarcane_Juice_Business {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int n = sc.nextInt();
		    int totP = 50*n;
		    int sgcn = (totP * 20) / 100;
		    int stmt = (totP * 20) / 100;
		    int rent = (totP * 30) / 100;
		    
		    System.out.println(totP - (sgcn + stmt + rent));
		    
		    t--;
		}
		
		sc.close();
    }    
}
