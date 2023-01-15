package com.met.model;

public class TrainingWorkshop implements Workshop {

	private TrainingCompany trainingCompany;
	
	
	public TrainingWorkshop() {
		super();
		System.out.println("Default constructor for JavaTrainer invoked...");
	}


	public TrainingWorkshop(TrainingCompany trainingCompany) {
		super();
		this.trainingCompany = trainingCompany;
		System.out.println("Paramaterized constructor for JavaTrainer invoked...");
	}
	

	public TrainingCompany getTrainingCompany() {
		return trainingCompany;
	}


	public void setTrainingCompany(TrainingCompany trainingCompany) {
		this.trainingCompany = trainingCompany;
	}


	@Override
	public void conductWorkshop() {
		// TODO Auto-generated method stub
		System.out.println("TrainingWorkshop::conductWorkshop");
		trainingCompany.conducttraining();

	}

}
