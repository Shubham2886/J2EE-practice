package com.met.model;

import java.util.List;

public class JavaTrainer implements Trainer  {

	private String name;
	private List<String> subjects;
	
	
	public JavaTrainer(String name, List<String> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
		System.out.println("Paramaterized constructor for JavaTrainer invoked...");
		
	}


	public JavaTrainer() {
		super();
		
		System.out.println("Default constructor for JavaTrainer invoked...");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getSubjjects() {
		return subjects;
	}


	public void setSubjjects(List<String> subjjects) {
		this.subjects = subjects;
	}


	@Override
	public void train() {
		// TODO Auto-generated method stub
		
		System.out.println("JavaTrainer::train()");
		System.out.println(name+"is teaching on java subjects"+subjects);
	
		
	}


	@Override
	public String toString() {
		return name +"is a java Trainer";
	}

	
	
	
	
	
	
	
	
	
	
	
}
