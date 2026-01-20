// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/NOTEBOOK

import java.util.Scanner;

class Count_Of_Notebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    int N = sc.nextInt();
		    System.out.println((N * 1000) / 100);
		    
		    t--;
		}
		
		sc.close();
    }    
}
