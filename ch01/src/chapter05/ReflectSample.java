package chapter05;

public class ReflectSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> cls = Class.forName("chapter05.Father");
		System.out.println("������"+cls.getPackage().getName());
		System.out.println("������"+cls.getName());
		

	}

}
