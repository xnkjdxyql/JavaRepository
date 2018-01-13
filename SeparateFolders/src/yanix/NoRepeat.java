/**Java手册app程序11
 * 1234四个数，可以组成多少个不重复的三位数
 * 工程创建方式选择单独文件
 */
package yanix;

/**
 * @author Administrator
 *
 */
public class NoRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int x=1;x<5;x++)
		{
			for(int y=1;y<5;y++)
			{
				for(int z=1;z<5;z++)
				{
					if(x!=y&&y!=z&&z!=x)
					{
						count++;
						System.out.print(x*100+y*10+z+" ");
						if(count%5==0)
							System.out.println();
					}
				}
			}
		}
		System.out.println();
		System.out.println("共有"+count+"个三位数");

	}

}
