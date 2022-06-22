package com.trident.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DataCollectors dto = new DataCollectors();
		
		DataCollectorsOperationImpl op = new DataCollectorsOperationImpl();
		
		System.out.println("Do you consume Alcohol? answer true/false.");
		boolean frstAns = sc.nextBoolean();
		dto.setAlcohol(frstAns);
		
		System.out.println("Do u have any health issues before? answer true/false.");
		boolean secAns = sc.nextBoolean();
		dto.setHealth(secAns);
		
		System.out.println("Do u have inform consent? answer true/false.");
		boolean thrdAns = sc.nextBoolean();
		dto.setConsent(thrdAns);
		
		op.saveData(dto);
		
		if(dto.isAlcohol() == false && dto.isHealth() == false) {
			op.throwMsg("not Eligible", true);
		}
	}
}
