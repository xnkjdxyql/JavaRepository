class fartherclass{
	public fartherclass(){
		System.out.println("���๹�캯������ing");		
	}
	{System.out.println("����Ǿ�̬��ʼ����");}
	static {System.out.println("���ྲ̬��ʼ����");}
	
	
}
public class InitPro extends fartherclass{
	static { System.out.println("���ྲ̬��ʼ����");}
	{System.out.println("����Ǿ�̬��ʼ����");}
	public InitPro (){
		
		System.out.println("���๹�캯��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Main start ---------");
		System.out.println("new һ������ʵ��A��ʼ");
		new InitPro();
		System.out.println("Newһ������ʵ��A����");
		System.out.println("new һ������ʵ��B��ʼ");
		new InitPro();
		System.out.println("new һ������ʵ��B����");
		System.out.println("---------main end-------------");

	}

}
