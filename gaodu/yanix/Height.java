/**
 * java手册app程序10
 * 一个球从100米高度落下，每次反弹高度为下落高度的一半
 * 求第10次反弹的高度
 */
package yanix;

/**
 * @author Administrator
 *
 */
public class Height {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h=100,s=100;
		for(int i=1;i<3;i++)
		{
			s=s+h;
			h=h/2;
		}
		System.out.println("经过路程"+s);
		System.out.println("反弹高度"+h/2);

	}

}
