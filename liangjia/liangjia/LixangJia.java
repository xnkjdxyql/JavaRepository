/** JAVA�ֲᣨapp������8
 * ��s=a+aa+aaa+...+aaaa
 *����������a��ֵ����ʱ����
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
		System.out.print("������a��n��ֵ��");
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
		System.out.println("����֮��Ϊ"+sum);
				

	}

}
