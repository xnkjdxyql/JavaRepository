class fartherclass{
	public fartherclass(){
		System.out.println("父类构造函数运行ing");		
	}
	{System.out.println("父类非静态初始化块");}
	static {System.out.println("父类静态初始化块");}
	
	
}
public class InitPro extends fartherclass{
	static { System.out.println("子类静态初始化块");}
	{System.out.println("子类非静态初始化块");}
	public InitPro (){
		
		System.out.println("子类构造函数");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Main start ---------");
		System.out.println("new 一个子类实例A开始");
		new InitPro();
		System.out.println("New一个子类实例A结束");
		System.out.println("new 一个子类实例B开始");
		new InitPro();
		System.out.println("new 一个子类实例B结束");
		System.out.println("---------main end-------------");

	}

}
