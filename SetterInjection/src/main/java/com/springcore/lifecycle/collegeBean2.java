package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class collegeBean2 implements InitializingBean,DisposableBean{
	
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	private String courseFee;
	private int code;
	@Override
	public String toString() {
		return "collegeBean2 [courseFee=" + courseFee + ", code=" + code + "]";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method is call by DisposableBean Interface");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {

       System.out.println("Init method is call by InitializingBean Interface");
       
		
	}
	

}
