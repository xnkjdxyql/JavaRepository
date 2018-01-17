package cn.itcast.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import cn.itcast.model.User;

//该类是对用户数据增删查改的。
public class UserDao {

	// 用户的数据都存储到该集合中。
	private static ArrayList<User> users = new ArrayList<User>();

	// 注册
	static Scanner scanner = new Scanner(System.in);

	
	
	public static void reg() {
		String userName = null;
		while (true) {
			System.out.println("请输入用户名:"); // 用户名首位不能以数字开头， 6位英文字母与数组组成
			userName = scanner.next();
			if (userName.matches("[a-zA-Z][a-zA-Z0-9]{4,5}")) {
				break;
			} else {
				System.out.println("用户名不符合规则..");
			}
		}
		String password = null;
		while (true) {
			System.out.println("请输入密码:"); // 用户名首位不能以数字开头， 6位英文字母与数组组成
			password = scanner.next();
			if (password.matches("\\d{6}")) {
				break;
			} else {
				System.out.println("密码不符合规则..");
			}
		}
		// 使用了新注册的信息生产一个用户对象。
		User user = new User(userName, password);
		users.add(user);
		System.out.println("注册功能...");
		System.out.println("当前用户有：" + users);

	}
	
	static Iterator it = users.iterator();
	public static void login() {
		System.out.println("请输入账号：");
		String userName = scanner.next();
		System.out.println("请输入密码:");
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
			System.out.println("欢迎管理员admin登陆...");
			
		} else if (isLogin == true) {
			System.out.println("欢迎登陆...");
			
		} else {
			if (errorUserName == true) {
				System.out.println("该用户不存在");
			} else if (errorPassWord == true) {
				System.out.println("用户名或者密码错误，可能密码错啦！");
			} else {
				System.out.println("该用户不存在");
			}
		}
	}
	
	public static void updateUserName(String userName){
		userName = null;
		while (true) {
			System.out.println("请输入用户名:"); // 用户名首位不能以数字开头， 6位英文字母与数组组成
			userName = scanner.next();
			if (userName.matches("[a-zA-Z][a-zA-Z0-9]{4,5}")) {
				break;
			} else {
				System.out.println("用户名不符合规则..");
			}
		}
	}
	
	public static void updatePassWord(String passWord){
		 passWord = null;
		while (true) {
			System.out.println("请输入密码:"); // 用户名首位不能以数字开头， 6位英文字母与数组组成
			passWord = scanner.next();
			if (passWord.matches("\\d{6}")) {
				break;
			} else {
				System.out.println("密码不符合规则..");
			}
		}
		
	}
	
	public static void selectAllUser(){
		while(it.hasNext()){
			System.out.println("元素"+it.next());
		}
	}
	
	public static void deleteUser(){
		users.remove(userName);
	}
	
	
	public static void adminManage(){
		Scanner sanner=new Scanner(System.in);
		while(true){
			System.out.println("请选择功能：查看图书(A) 添加图书(B) 修改图书(C) 删除图书(D) "
					+ "修改用户名(E) 修改密码(F)  注销(Q)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){//查看图书(A) 
				selectBook();
				
			}else if("b".equalsIgnoreCase(option)){//添加图书(B)
				 addBook();
				 
			}if("c".equalsIgnoreCase(option)){    //修改图书(C) 
				updateBook();
				
			}else if("d".equalsIgnoreCase(option)){ //删除图书(D)
				deleteBook();
				
			}else if("e".equalsIgnoreCase(option)){//修改用户名(E)
				updateUserName();
				
			}else if("f".equalsIgnoreCase(option)){//修改密码(F)
				updatePassWord();
				
			}else if("Q".equalsIgnoreCase(option)){//注销(Q)
				System.exit(0);
			}else{
				System.out.println("你的输入有误，请重新输入...");
				
			}
		
		}
	}
	
	public static void userManage(){
		Scanner sanner=new Scanner(System.in);
		while(true){
			System.out.println("请选择功能：查看图书(A) 添加图书(B) 修改图书(C) 删除图书(D) "
					+ "修改用户名(E) 修改密码(F) 修改用户(G) 删除用户(H) 查看所有用户(I) 注销(Q)");
			String option = scanner.next();
			
			

			if("a".equalsIgnoreCase(option)){//查看图书(A) 
				selectBook();
				
			}else if("b".equalsIgnoreCase(option)){//添加图书(B)
				 addBook();
				 
			}if("c".equalsIgnoreCase(option)){    //修改图书(C) 
				updateBook();
				
			}else if("d".equalsIgnoreCase(option)){ //删除图书(D)
				deleteBook();
				
			}else if("e".equalsIgnoreCase(option)){//修改用户名(E)
				updateUserName();
				
			}else if("f".equalsIgnoreCase(option)){//修改密码(F)
				updatePassWord();
				
			}else if("g".equalsIgnoreCase(option)){//修改用户(G)
				updateUser();
				
			}else if("h".equalsIgnoreCase(option)){// 删除用户(H)
				deleteUser();
				
			}else  if("i".equalsIgnoreCase(option)){//查看所有用户(I)
				selectAllUser();                          
				
			}else if("Q".equalsIgnoreCase(option)){//注销(Q)
				System.exit(0);
			}else{
				System.out.println("你的输入有误，请重新输入...");
				
			}
		
		}
	}
}
