/**
 * 
 */
package app_10;

/**
 * @author Administrator
 *
 */
public class App_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=1;
		double sum=0;
		for(int i=1;i<=20;i++){
			sum=sum+(double)x/y;
			x=x+y;
			y=x-y;
//			System.out.println(x+"/"+y);
		}
		System.out.println("前二十项之和: "+sum);
		

	}

}
