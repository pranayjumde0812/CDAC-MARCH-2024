import java.util.Date;
import java.util.Scanner;

import com.custom_exception.PollutionLevelExceededException;
import com.enum_classes.Color;
import com.vehicle.Vehicle;
import static com.validation.ValidationRules.checkpollutionLevel;
import static com.utility_classes.VehicleUtility.*;
//import static com.utility_classes.VehicleUtility.displayVehicleDetails;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter size of Vehicle Array : ");
			Vehicle[] vehicle = new Vehicle[sc.nextInt()];
			acceptVehicleDetails(vehicle);
			displayVehicleDetails(vehicle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
