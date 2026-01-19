// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/EXPERT

import java.util.Scanner;

class Expert_Setter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int x = sc.nextInt(), y = sc.nextInt();
		    int app = (int)Math.ceil(x/2.0);
		    if(app <= y) System.out.println("yes");
            else System.out.println("no");
            		    
		    t--;
		}
		
		sc.close();
    }
}
