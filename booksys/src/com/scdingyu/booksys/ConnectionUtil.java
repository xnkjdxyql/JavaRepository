package com.scdingyu.booksys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	//1.加载驱动
	static{//静态代码块,只执行一次
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//2.获取连接
	public static Connection getConnection() {
		//声明连接对象
		Connection connection = null;
		try {
			//获取连接对象,需要三个参数
			/***
			 * url:连接路径
			 * user:SQLServer的用户名：sa
			 * password:SQLServer的密码:sqlpass
			 */
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=test", "sa", "sqlpass");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;//返回连接对象
	}
	
	
	public static void main(String[] args) {
		//获取到tb_user表中的所以数据
		//3.创建SQL语句
		String sql = "select * from tb_user";
		//4.获取到连接对象
		Connection connection = getConnection();
		//5.执行对象
		PreparedStatement statement = null;
		//6.声明结果集对象
		ResultSet rs = null;
		//7.发送执行的命令
		try {
			//通过连接对象创建执行对象
			statement = connection.prepareStatement(sql);
			rs = statement.executeQuery();//执行
			/**
			 * while():循环读取行数据
			 * rs.next():判断是否有下一行
			 * rs.getObject(1):表示获取到该行中的第一列
			 * rs.getObject(2):表示获取到该行中的第二列
			 */
			while(rs.next()){
				System.out.println(rs.getObject(1));
				System.out.println(rs.getObject(2));
			}
		} catch (SQLException e) {
 			e.printStackTrace();
		}finally{
			//释放资源
			//1.关闭结果集对象
			if (rs != null) {//判断是否为空,如果对象为null,再调用方法,会出现空指针异常
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			//2.关闭执行对象
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			//3.关闭连接对象
			if (connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
