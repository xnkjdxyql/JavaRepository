package temperature.convert;

import java.util.Scanner;

/**
 * @author yanix
 *
 */
public class Converter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ������ʵ�����϶Ⱥͻ��϶ȵ�ת��
		 * JAVA���������湦��ڶ��� 
		 *  * */
		int flag;
		int centigrade;
		int fahrenheit;
		double centigrade1;
		double fahrenheit1;
		System.out.println("�¶��໥ת����1--->�����¶�ת�����¶�");
		System.out.println("�¶��໥ת����2--->�����¶�ת�����¶�");
		System.out.print("����������ѡ��");
		Scanner input1=new Scanner(System.in);
		flag=input1.nextInt();
		if(flag==1)
		{
			System.out.print("�����������¶ȣ�");
			Scanner input2=new Scanner(System.in);
			centigrade=input2.nextInt();
			fahrenheit1=9.0*centigrade/5.0+32; //�����¶ȵ������¶ȵ�ת����ʽ��
			System.out.printf("ת���ɻ����¶�Ϊ��%.1f\n", fahrenheit1);
		}
		else if (flag==2) 
		{
			System.out.print("�����뻪���¶ȣ�");
			Scanner input3=new Scanner(System.in);
			fahrenheit=input3.nextInt();
			centigrade1=5.0/9.0*(fahrenheit-32);//�����¶ȵ������¶ȵļ��㹫ʽ��
			System.out.printf("ת���������¶�Ϊ��%.1f\n",centigrade1);

		 }
		else
		{
			
			System.out.println("������󣬳�����ֹ��");
		}
	}

}
