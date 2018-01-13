/**
 * 
 */
package chengfabiao;

/**
 * @author Administrator
 *
 */
public class chengfa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++){
			for(int j=1;j<i;j++){
				System.out.print(j+"*"+i+"="+j*i+" ");
				if(i*j<10){System.out.print(" ");}
			}
			System.out.println();
		}

	}

}
