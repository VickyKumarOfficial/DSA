import java.util.Scanner;

class Minimum_Cars_Required {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
		    int n = sc.nextInt();
		    if(n < 4) System.out.println(1);
		    else System.out.println((int)Math.ceil(n/4.0));
		}
		
		sc.close();
    }    
}
