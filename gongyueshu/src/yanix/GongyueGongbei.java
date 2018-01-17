/**
 * 求两个数的最大公约数和最小公倍数
 */
package yanix;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @author Administrator
 *
 */
public class GongyueGongbei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,ji;
		System.out.print("请输入两个数：");
		Scanner scanner=new Scanner(System.in);
		m=scanner.nextInt();
		n=scanner.nextInt();
		ji=m*n;
		//System.out.println("m="+m+";"+"n="+n);
		if (m<n)
		{
			int t=m;
			m=n;
			n=t;
		}
		//System.out.println("m="+m+";"+"n="+n);
		while(n!=0)
		{
			int remain=m%n;
			m=n;
			n=remain;			
		}
		System.out.println("最大公约数:"+m);
		System.out.print("最小公倍数:"+(ji/m));
	}

}
