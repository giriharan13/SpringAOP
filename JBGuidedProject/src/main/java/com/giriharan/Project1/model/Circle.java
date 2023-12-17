package com.giriharan.Project1.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String setAndReturnName(String name) {
		this.name = name;
		return name;
	}
	
	

}
