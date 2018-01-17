/**
 * 统计一个字符串只中的字母、数字、空格等的个数，字符用单引号，字符串用双引号
 * 切勿搞错
 */
package yanix;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class TongJiZiFuChuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit=0;
		int character=0;
		int blank=0;
		int other=0;
		char[] ch;
		System.out.print("请输入需要统计的字符串：");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		
		ch=string.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				digit++;
			}
			else if (ch[i]>='a'&&ch[i]<='z')
			{
				character++;
			}
			else if (ch[i]==' ')
			{
				blank++;
			}
			else 
			{
				other++;
			}
		}
		System.out.println("数字个数为："+digit);
		System.out.println("空格个数为："+blank);
		System.out.println("字符个数为："+character);
		System.out.println("其他个数为："+other);
		/*System.out.println('\ubf20');
		* \ubf20表示是Unicode字符bf20
		*
		*/
	}

}
