// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MOVIE2X

import java.util.*;

public class Watching_Movies_at_2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int time = x-(y/2);
		System.out.println(time);
        
        sc.close();
    }
}
