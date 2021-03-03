package com.samuelvazquez;

public class KidRobot implements ArtificialMechanism {

	private SubtaskService service;
	private String name;
	private String brand;
	
	public KidRobot() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setService(SubtaskService service) {
		this.service = service;
	}

	@Override
	public void walk() {
		System.out.println("Walking like a baby robot...");
		
	}

	@Override
	public void doSubtask1() {
		System.out.println(service.turnOnLights());
		
	}

}
