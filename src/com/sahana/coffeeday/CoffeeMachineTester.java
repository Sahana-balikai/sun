package com.sahana.coffeeday;
import com.sahana.coffeeday.appliances.Power;
import com.sahana.coffeeday.appliances.CoffeeMachine;

public class CoffeeMachineTester {
	public static void main(String[] args) {

		CoffeeMachine machine = new CoffeeMachine(new Power());

		boolean success = machine.grind("Civet");
		if (success) {
			System.out.println("I know grinding was done");

		} else {
			System.out.println("Griding not done");

		}

	}

}
