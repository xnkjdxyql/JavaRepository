/**
 * 
 */
package shushu;

/**
 * @author Administrator
 *
 */
public class lianxi02 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int count=0;
		for(int i=101;i<=200;i+=2)
		{
			boolean b=true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				
				if(i%j==0)
				{
					b=false;
					break;
				}
				
			}
			if(b==true) 
			{
				count++;				
				System.out.print(i+" ");
				if(count%5==0){System.out.println();}
			}
		}
			System.out.println();
			System.out.print("101到200之间共有"+count+"个素数");
	}

}
