package dsproject;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		  System.out.println("VENSIYA T\n711525BAD174\nI AIDS 'A'");
		  Scanner sc = new Scanner(System.in);
	        BrowserHistory bh = new BrowserHistory();
	        System.out.println("Enter 5 URLs:");
	        for (int i = 0; i < 5; i++) {
	            String url = sc.nextLine();
	            bh.visitPage(url);
	        }
	        System.out.println();
	        bh.popTwoPages();
	        System.out.println();
	        bh.currentPage();
	        sc.close();
	}
}
