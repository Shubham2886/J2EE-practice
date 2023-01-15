package com.met.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.model.JavaTrainer;
import com.met.model.METsolutions;
import com.met.model.Trainer;
import com.met.model.TrainingCompany;
import com.met.model.TrainingWorkshop;

public class Springtest {
	
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("training.xml");
	
JavaTrainer jt = context.getBean("javaTrainer",JavaTrainer.class);

System.out.println(jt);
jt.train();

	
	TrainingCompany tc = context.getBean("metSolutions",TrainingCompany.class);
	System.out.println(tc);
	tc.conducttraining();
	


	
}
}
