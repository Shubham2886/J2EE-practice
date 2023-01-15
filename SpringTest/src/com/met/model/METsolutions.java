package com.met.model;

public class METsolutions implements TrainingCompany {

	private Trainer trainer;
	
	public METsolutions(Trainer trainer) {
		super();
		this.trainer = trainer;
		System.out.println("Paramaterized constructor for JavaTrainer invoked...");
	}

	
	public METsolutions() {
		super();
		System.out.println("Default constructor for JavaTrainer invoked...");
	}


	
	public Trainer getTrainer() {
		return trainer;
	}


	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}


	@Override
	public void conducttraining() {
		// TODO Auto-generated method stub
		System.out.println("METSolutions::conductTraining()");
		trainer.train();

	}


	@Override
	public String toString() {
		return "METsolutions is Training Company";
	}
	
	
	

}
