/**
 * 测试scanner的next和nextline方法
 * nextline只以回车键作为行结束标志，因此可以读有空格的字符串
 * next以第一个有效字符之后的第一个空白字符（回车，tab，空格）为结束标记
 * 因此next不可以读取中间有空格的字符串
 */
package yanix;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Scanner_next_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1
		Double s1;
		String s2;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入第一个字符串：");
		//s1=sc.nextLine();
		s1=sc.nextDouble();
		//sc.nextLine(); 
		//读取上一个next、nextint、nextdouble等丢弃的回车,防止s2读取s1
		//的next、nextint、nextdouble等丢弃的回车
		System.out.print("请输入第二个字符串：");
		//s2=sc.next();
		s2=sc.next();
		System.out.println("s1="+s1+" s2="+s2);
	}

}
