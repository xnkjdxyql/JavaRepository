/**
 * java�ֲ�app����10
 * һ�����100�׸߶����£�ÿ�η����߶�Ϊ����߶ȵ�һ��
 * ���10�η����ĸ߶�
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
		System.out.println("����·��"+s);
		System.out.println("�����߶�"+h/2);

	}

}
