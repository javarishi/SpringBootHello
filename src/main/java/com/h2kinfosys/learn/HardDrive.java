package com.h2kinfosys.learn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hd1")
@Scope("prototype")
public class HardDrive {
	
	public HardDrive() {
		// TODO Auto-generated constructor stub
	}
	private int hid;
	private String model;
	private String company;
	
	
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void compression() {
		System.out.println("Hard Drive Compression Executed");
	}
	

}
