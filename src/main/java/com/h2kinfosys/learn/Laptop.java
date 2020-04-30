package com.h2kinfosys.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Laptop {
	
	private int lid;
	private String model;
	private String os;
	@Autowired
	@Qualifier("hd1")
	private HardDrive hardDrive;

	public Laptop() {
		System.out.println("Laptop");
	}
	
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", model=" + model + ", os=" + os + "]";
	}


	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public void showLaptop() {
		System.out.println("Show Laptop");
		hardDrive.compression();
	}
}
