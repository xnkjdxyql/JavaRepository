package cn.itcast.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import cn.itcast.model.User;

//�����Ƕ��û�������ɾ��ĵġ�
public class UserDao {

	// �û������ݶ��洢���ü����С�
	private static ArrayList<User> users = new ArrayList<User>();

	// ע��
	static Scanner scanner = new Scanner(System.in);

	
	
	public static void reg() {
		String userName = null;
		while (true) {
			System.out.println("�������û���:"); // �û�����λ���������ֿ�ͷ�� 6λӢ����ĸ���������
			userName = scanner.next();
			if (userName.matches("[a-zA-Z][a-zA-Z0-9]{4,5}")) {
				break;
			} else {
				System.out.println("�û��������Ϲ���..");
			}
		}
		String password = null;
		while (true) {
			System.out.println("����������:"); // �û�����λ���������ֿ�ͷ�� 6λӢ����ĸ���������
			password = scanner.next();
			if (password.matches("\\d{6}")) {
				break;
			} else {
				System.out.println("���벻���Ϲ���..");
			}
		}
		// ʹ������ע�����Ϣ����һ���û�����
		User user = new User(userName, password);
		users.add(user);
		System.out.println("ע�Ṧ��...");
		System.out.println("��ǰ�û��У�" + users);

	}
	
	static Iterator it = users.iterator();
	public static void login() {
		System.out.println("�������˺ţ�");
		String userName = scanner.next();
		System.out.println("����������:");
		String passWord = scanner.next();

		boolean errorUserName = false;
		boolean errorPassWord = false;
		boolean isLogin = false;
		boolean adminLogin = false;
		while (it.hasNext()) {
			User user = (User) it.next();
			 if (user.getUserName().equals("admin")) {
					adminLogin = true;
				}else
			if (!(user.getUserName().equals(userName))) {
				errorUserName = true;
			} else if (!(user.getPassword().equals(passWord))) {
				errorPassWord = true;
			} else if (user.getUserName().equals(userName)
					&& user.getPassword().equals(passWord)) {
				isLogin = true;
			} 
		}
		if (adminLogin == true) {
			System.out.println("��ӭ����Աadmin��½...");
			
		} else if (isLogin == true) {
			System.out.println("��ӭ��½...");
			
		} else {
			if (errorUserName == true) {
				System.out.println("���û�������");
			} else if (errorPassWord == true) {
				System.out.println("�û�������������󣬿������������");
			} else {
				System.out.println("���û�������");
			}
		}
	}
	
	public static void updateUserName(String userName){
		userName = null;
		while (true) {
			System.out.println("�������û���:"); // �û�����λ���������ֿ�ͷ�� 6λӢ����ĸ���������
			userName = scanner.next();
			if (userName.matches("[a-zA-Z][a-zA-Z0-9]{4,5}")) {
				break;
			} else {
				System.out.println("�û��������Ϲ���..");
			}
		}
	}
	
	public static void updatePassWord(String passWord){
		 passWord = null;
		while (true) {
			System.out.println("����������:"); // �û�����λ���������ֿ�ͷ�� 6λӢ����ĸ���������
			passWord = scanner.next();
			if (passWord.matches("\\d{6}")) {
				break;
			} else {
				System.out.println("���벻���Ϲ���..");
			}
		}
		
	}
	
	public static void selectAllUser(){
		while(it.hasNext()){
			System.out.println("Ԫ��"+it.next());
		}
	}
	
	public static void deleteUser(){
		users.remove(userName);
	}
	
	
	public static void adminManage(){
		Scanner sanner=new Scanner(System.in);
		while(true){
			System.out.println("��ѡ���ܣ��鿴ͼ��(A) ���ͼ��(B) �޸�ͼ��(C) ɾ��ͼ��(D) "
					+ "�޸��û���(E) �޸�����(F)  ע��(Q)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){//�鿴ͼ��(A) 
				selectBook();
				
			}else if("b".equalsIgnoreCase(option)){//���ͼ��(B)
				 addBook();
				 
			}if("c".equalsIgnoreCase(option)){    //�޸�ͼ��(C) 
				updateBook();
				
			}else if("d".equalsIgnoreCase(option)){ //ɾ��ͼ��(D)
				deleteBook();
				
			}else if("e".equalsIgnoreCase(option)){//�޸��û���(E)
				updateUserName();
				
			}else if("f".equalsIgnoreCase(option)){//�޸�����(F)
				updatePassWord();
				
			}else if("Q".equalsIgnoreCase(option)){//ע��(Q)
				System.exit(0);
			}else{
				System.out.println("���������������������...");
				
			}
		
		}
	}
	
	public static void userManage(){
		Scanner sanner=new Scanner(System.in);
		while(true){
			System.out.println("��ѡ���ܣ��鿴ͼ��(A) ���ͼ��(B) �޸�ͼ��(C) ɾ��ͼ��(D) "
					+ "�޸��û���(E) �޸�����(F) �޸��û�(G) ɾ���û�(H) �鿴�����û�(I) ע��(Q)");
			String option = scanner.next();
			
			

			if("a".equalsIgnoreCase(option)){//�鿴ͼ��(A) 
				selectBook();
				
			}else if("b".equalsIgnoreCase(option)){//���ͼ��(B)
				 addBook();
				 
			}if("c".equalsIgnoreCase(option)){    //�޸�ͼ��(C) 
				updateBook();
				
			}else if("d".equalsIgnoreCase(option)){ //ɾ��ͼ��(D)
				deleteBook();
				
			}else if("e".equalsIgnoreCase(option)){//�޸��û���(E)
				updateUserName();
				
			}else if("f".equalsIgnoreCase(option)){//�޸�����(F)
				updatePassWord();
				
			}else if("g".equalsIgnoreCase(option)){//�޸��û�(G)
				updateUser();
				
			}else if("h".equalsIgnoreCase(option)){// ɾ���û�(H)
				deleteUser();
				
			}else  if("i".equalsIgnoreCase(option)){//�鿴�����û�(I)
				selectAllUser();                          
				
			}else if("Q".equalsIgnoreCase(option)){//ע��(Q)
				System.exit(0);
			}else{
				System.out.println("���������������������...");
				
			}
		
		}
	}
}
