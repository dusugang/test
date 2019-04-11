package com.youbaoplus.tee;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	private String name;
	private String sex;
	private String date;
	public User() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public void  PrintUserInf(){
		System.out.println("姓名："+name+"\n性别："+sex+"\n出生日期："+date);
	}
	
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-main-single.xml");
		User user = (User)context.getBean("user");
		user.PrintUserInf();
	}
	
	
	

}
