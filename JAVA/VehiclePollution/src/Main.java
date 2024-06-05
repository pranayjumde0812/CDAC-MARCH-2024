import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.utils.VehicleUtility.*;

import com.vehicle.Vehicle;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<Vehicle> vehicles = new ArrayList<>();
			int choice;
			do {
				System.out.println("Enter your choice...below");
				System.out.println("1.Add Vehicles | 2.Drive a vehicle");
				choice = sc.nextInt();

				try {
					switch (choice) {
					case 1 :
						addVehicledetails(vehicles);
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			} while (choice != 0);

		}
	}
}
