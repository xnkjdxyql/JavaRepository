/**
 * 
 */
package first;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double num;
			System.out.println("hello world");
			System.out.print("please input a number:");
			Scanner inputer=new Scanner(System.in);
			num=inputer.nextDouble();
			System.out.print(num*100);
	}

}
