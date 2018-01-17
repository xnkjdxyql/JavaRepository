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
		 * 本程序实现摄氏度和华氏度的转化
		 * JAVA开发入行真功夫第二章 
		 *  * */
		int flag;
		int centigrade;
		int fahrenheit;
		double centigrade1;
		double fahrenheit1;
		System.out.println("温度相互转换：1--->摄氏温度转华氏温度");
		System.out.println("温度相互转换：2--->华氏温度转摄氏温度");
		System.out.print("请输入您的选择：");
		Scanner input1=new Scanner(System.in);
		flag=input1.nextInt();
		if(flag==1)
		{
			System.out.print("请输入摄氏温度：");
			Scanner input2=new Scanner(System.in);
			centigrade=input2.nextInt();
			fahrenheit1=9.0*centigrade/5.0+32; //摄氏温度到华氏温度的转换公式；
			System.out.printf("转化成华氏温度为：%.1f\n", fahrenheit1);
		}
		else if (flag==2) 
		{
			System.out.print("请输入华氏温度：");
			Scanner input3=new Scanner(System.in);
			fahrenheit=input3.nextInt();
			centigrade1=5.0/9.0*(fahrenheit-32);//华氏温度到摄氏温度的计算公式；
			System.out.printf("转化成摄氏温度为：%.1f\n",centigrade1);

		 }
		else
		{
			
			System.out.println("输入错误，程序终止！");
		}
	}

}
