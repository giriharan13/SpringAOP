package com.giriharan.Project1.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Triangle {
	
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	 public String setAndReturnName(String name) {
		if(name.equals("1")) { throw new RuntimeException(); }
		this.name = name;
		return name;
	}
}
