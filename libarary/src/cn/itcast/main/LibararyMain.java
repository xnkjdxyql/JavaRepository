package cn.itcast.main;

import java.util.Scanner;

import cn.itcast.dao.UserDao;

public class LibararyMain {
	
	public static void main(String[] args) {
		System.out.println("****************************************");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*    1208java������ͼ���                                           *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		Scanner  scanner = new Scanner(System.in);
		UserDao userDao = new UserDao();

		while(true){
			System.out.println("��ѡ���ܣ�A(�û���½)    B(ע���û�)      Q(�˳�ϵͳ)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				userDao.login();
				
			}else if("b".equalsIgnoreCase(option)){
				//ע��
				userDao.reg();
				
			}else if("Q".equalsIgnoreCase(option)){
				System.exit(0);
			}else{
				System.out.println("���������������������...");
				
			}
		
		}
		
		
	}

}
