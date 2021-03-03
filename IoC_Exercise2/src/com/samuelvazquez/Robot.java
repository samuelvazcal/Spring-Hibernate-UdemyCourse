package com.samuelvazquez;

public class Robot implements ArtificialMechanism{
	//define a private field for the dependency
	private SubtaskService service;
	
	//constructor
	public Robot(SubtaskService service) {
		this.service = service;
	}
	
	public void walk() {
		System.out.println("Walking like C3PO...");
	}

	@Override
	public void doSubtask1() {
		//use my service to get a subtask
		//robot can 'walk' on his own, but for a subtask needs a helper
		System.out.println(service.turnOnLights());
	}

}
