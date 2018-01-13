/** JAVA手册（app）程序8
 * 求s=a+aa+aaa+...+aaaa
 *其中项数和a的值运行时输入
 */
package liangjia;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class LixangJia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,n,temp,sum=0;
		System.out.print("请输入a和n的值：");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		n=scanner.nextInt();
		scanner.close();
		//System.out.print("a:"+a+" n:"+n);
		sum=a;temp=a;
		while (n>1) {
			temp=(temp*10+a);
			sum=sum+temp;
			n--;			
		}
		System.out.println("总数之和为"+sum);
				

	}

}
