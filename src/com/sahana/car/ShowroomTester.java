package com.sahana.car;
import com.sahana.car.manager.ManagerDTO;
import com.sahana.car.showrrom.CarShowroom;

public class ShowroomTester {
	public static void main(String[] args) {

		CarShowroom carShowroom = new CarShowroom();
		System.out.println(" ");

		carShowroom.addManager("sahana", 8105290224l);
		carShowroom.displayManager();
		System.out.println(" ");

		carShowroom.removeManager();
		carShowroom.displayManager();
		System.out.println(" ");

		ManagerDTO managerDTO = new ManagerDTO("sapna", 7676965849l);
		carShowroom.updateManager(managerDTO);
		carShowroom.displayManager();
		System.out.println(" ");

		carShowroom.addManager(managerDTO);
		carShowroom.displayManager();
		System.out.println(" ");

		ManagerDTO managerDTO2 = new ManagerDTO("sahana", 8105290224l);
		carShowroom.updateManager(managerDTO2);
		carShowroom.displayManager();

	}

}
