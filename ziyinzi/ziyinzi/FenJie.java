/**
 * 分解质因子如90=2*3*3*5
 */
package ziyinzi;

import java.util.Scanner;

/**
 * @author 麒麟
 *
 */
public class FenJie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int n = scanner.nextInt();
		int k = 2;
		System.out.print(n+"=");
		while(k<=n){
			if(k==n)
			{
				System.out.print(n);break;				
			}
			else if(n%k==0)
			{
				System.out.print(k+"*");n=n/k;
			}
			else
			{
				k++;
			}
			
		}
	}

}
