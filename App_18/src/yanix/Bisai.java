/**
 * 
 */
package yanix;

/**
 * @author Administrator
 *
 */
public class Bisai {

	/**
	 * @param args
	 */
	static char[] m = {'a','b','c'};
	static char[] n = {'x','y','z'};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<m.length;i++){
			for(int j=0;j<n.length;j++){
				if(m[i]=='a'&&n[j]=='x'){
					continue;
				}
//				else if (m[i]=='a'&&n[j]=='y') {
//					continue;					
//				}
				else if ((m[i]=='c'&&n[j]=='x')
						||(m[i]=='c'&&n[j]=='z')) {
					continue;
				}
//				else if ((m[i]=='b'&&n[j]=='z')
//						||(m[i]=='b'&&n[j]=='y')){
//					continue;
//				}
				else {
					System.out.println(m[i]+" VS "+n[j]);
				}
			}
			
		}
	}

}
