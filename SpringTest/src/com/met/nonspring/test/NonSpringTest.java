package com.met.nonspring.test;

import java.util.ArrayList;
import java.util.List;

import com.met.model.JavaTrainer;
import com.met.model.METsolutions;
import com.met.model.Trainer;
import com.met.model.TrainingWorkshop;
import com.met.model.Workshop;

public class NonSpringTest {
	
	public static void main(String[] args) {
		
//		List<String> subjects = new ArrayList<>();
//		subjects.add("JDBC");
//		subjects.add("Collections");
//		subjects.add("Reflection");
//		subjects.add("OOPS");
		
		
		List<String> subjects = new ArrayList<>();
		subjects.add("Rmi");
		subjects.add("Servlets");
		subjects.add("JSP");
		subjects.add("WebServices");
		//Trainer advjavaTrainer = new JavaTrainer("Ramesh",subjects);
		
//		javaTrainer.train();
		
		Trainer advJavaTrainer = new JavaTrainer("AJay",subjects);
		
		//advJavaTrainer.train();
		
		
		METsolutions metsolutions = new METsolutions();
		metsolutions.setTrainer(advJavaTrainer);
		
		//metsolutions.conducttraining();
	
		Workshop tw = new TrainingWorkshop(metsolutions);
		tw.conductWorkshop();
		
	}

}
