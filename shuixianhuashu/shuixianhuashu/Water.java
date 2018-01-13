/**
 * 
 */
package shuixianhuashu;

/**
 * @author Administrator
 *
 */
public class Water {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i,j,k;
		//System.out.print(Math.pow(3, 2));
		boolean flag=false;
		for(int n=100;n<1000;n++)
		{
			i=n/100;j=(n%100)/10;k=n%10;
			if((Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(k, 3))==n)
			{
				flag=true;
			}
			if(flag){System.out.print(n+" ");flag=false;}
		}  

	}

}
