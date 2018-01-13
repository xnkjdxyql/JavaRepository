/**
 * 
 */
package yanix;

import sun.print.PSPrinterJob.PluginPrinter;

/**
 * @author Administrator
 *
 */
public class lingxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++){
			for(int j=1;j<=(2*i-1);j++){
			System.out.print("*");}
			System.out.println();
		}
		for(int m=1;m<=3;m++){
			for(int n=1;n<=(5-((m-1)*2));n++){
				System.out.print("*");				
			}
			System.out.println("");
		}
		

	}

}
