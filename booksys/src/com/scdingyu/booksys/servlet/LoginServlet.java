package com.scdingyu.booksys.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scdingyu.booksys.ConnectionUtil;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = -724292362147796506L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//处理中文乱码
		request.setCharacterEncoding("UTF-8");
		//获取请求参数
		String userName = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		System.out.println(userName);
		System.out.println(pwd);
		
		//1.获取连接
		Connection connection = ConnectionUtil.getConnection();
		//2.声明执行对象
		PreparedStatement statement = null;
		//3.声明结果集对象
		ResultSet rs = null;
		//4.创建登录的SQL语句
		String sql = "select * from tb_user where userName = ? and pwd = ?";
		String msg = "登录失败！";//默认提示消息为登录失败！
		try {
			//5.通过连接对象创建语句执行对象
			statement = connection.prepareStatement(sql);
			//6.设置参数值
			statement.setString(1, userName);
			statement.setString(2, pwd);
			//7.执行并返回结果集
			rs = statement.executeQuery();
			//8.判断是否有数据
			if(rs.next()){
				msg = "登录成功！";
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
		System.out.println(msg);
		
	}
	
}
