/**
 * �ֽ���������90=2*3*3*5
 */
package ziyinzi;

import java.util.Scanner;

/**
 * @author ����
 *
 */
public class FenJie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("������һ����������");
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
