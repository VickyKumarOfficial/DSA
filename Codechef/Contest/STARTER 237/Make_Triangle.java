// https://www.codechef.com/START237D/problems/MAKETRIANGLE?tab=ide

import java.util.*;

public class Make_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int c = 0;
		    int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		    while(true) {
    		    if((x+y > z) && (y+z > x) && (x+z > y)) {
    		        System.out.println(c);
    		        break;
    		    }
    		    else {
    		        c++;
    		        if(x+y <= z) {
    		            if(x < y) y++;
    		            else x++;
    		        }
    		        else if(y+z <= x) {
    		            if(y < z) z++;
    		            else y++;
    		        }
    		        else if(x+z <= y) {
    		            if(x < z) z++;
    		            else x++;
    		        }
    		    }
		    }
		} 
        sc.close();
    }    
}
