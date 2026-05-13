// https://www.codechef.com/START238D/problems/WECREC

import java.util.*;

public class WEC_REC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int k = sc.nextInt();
		    int[] a = new int[n];
		    for (int  i= 0; i < n; i++) a[i] = sc.nextInt();
		    
		    Map<Integer, Integer> f = new HashMap<>();
		    for (int num : a) {
		        f.put(num , f.getOrDefault(num, 0) + 1);
		    }
		    List<Map.Entry<Integer, Integer>> l = new ArrayList<>(f.entrySet());
		    Collections.sort(l, (p, q) -> {
		        return q.getKey() - p.getKey();
		    });
		    int i = 1, ans = 0;
		    for (var ele : l) {
		        if (i <= k) {
		            ans += ele.getValue();
		        }
		        else break;
		        i++;
		    }
		    System.out.println(Math.min(ans, x));
		}
        sc.close();
    }
}
