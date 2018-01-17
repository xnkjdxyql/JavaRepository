package chapter05;

public class Children extends Father {
	public void a(){
			System.out.println("This is the function of children!");
	}
	
	public static void main(String[] args) {
		Father daddy=new Children();
		
		daddy.a();
	}
}
