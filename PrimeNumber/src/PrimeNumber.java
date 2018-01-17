/**
 * 求101到200之间的素数数量，并输出这些数
 */

/**
 * @author Administrator
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=101;i<200;i+=2)
		{
			boolean b=false;
			for (int j = 2; j < Math.sqrt(i); j++) 
			{
				if(i%j==0){b=true;break;}
			//	else{b=true;}
			}
			if(b==false){ count++;System.out.print(i+" ");
			if(count%5==0){System.out.println();}//每输出五个换一行
			}			
		}
		System.out.println();//换行输出总数
		System.out.print("区间101到200总共有"+count+"个素数");
	}

}
