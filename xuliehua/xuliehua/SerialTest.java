/**
 * 序列化测试
 */
package xuliehua;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class SerialTest implements Serializable {

	/**
	 * @param args
	 */
	private String name;
	public SerialTest()
	{
		this.name="new instances";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerialTest inst=new SerialTest();
		try {
			FileOutputStream fos=new FileOutputStream("catDemo.out");
			/*catDemo.out文件在工程当前目录下，工程当前位置为：
			 * E:\workspace\java\xuliehua文件下
			 */
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			System.out.println("1>"+inst.getName());
			inst.setName("my cat");
			System.out.println("the new name is "+inst.getName());
			oos.writeObject(inst);
			oos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			FileInputStream fis=new FileInputStream("catDemo.out");
			/*catDemo.out文件在工程当前目录下，工程当前位置为：
			 * E:\workspace\java\xuliehua文件下
			 * 
			 */
			ObjectInputStream ois=new ObjectInputStream(fis);
			inst=(SerialTest)ois.readObject();
			System.out.println("2>"+inst.getName());
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
