//5. Write a menu driven program for above menu 
//This application will be used by store owner(admin) or customers. 
//Consider two users are already there in the system for simplicity. 
//Admin User (loginId=admin, password = admin)
//Customer (loginId=c1, password=c1)
//
//Login is required to perform any operation. Without login, access to any functionality will throw exception. 
//
//Store owner can perform any operation after login.
//
//A customer can browse, order and check status of his order after login. 
//
//Customer can’t access Admin only functionalities like Add Pet, Update Pet, Update order status etc.
//Accessing Admin only functionality by customer will throw Unauthorized exception
//
//Pet Store Application Menu: 
//Login
//Add new Pet (Admin only functionality)
//Update Pet details (Admin only functionality)
//Display all available pets
//Order a Pet
//Check order status by Order Id
//Update order status (Admin only functionality)
//Exit
//
//Core classes
//Pet ( petId, name, category, unitPrice, stocks)
//Category is an enum with values like (CAT, DOG, RABBIT, FISH)
//Example:
//  petId = 101, name=” Bull Dog”, category= DOG, unitPrice= 1000, stocks=50
//
//Order (orderId, petId, quantity, status)
//Status is an enum with values like (PLACED, IN_PROCESS, COMPLETED)
//Example: 
//   orderId=1, petId=101, quantity=5, status=PLACED
//
//Hints :
//Create classes, Enums – Pet, Order, Category, Status 
//Create required exception classes – AuthenticationException, AuthorizationException, OutOfStockException 
//Handle exceptions
//Menu creation, using suitable collection classes for storing Pet and Order
//Login 
//Auto Order Id generation .0
//Adjusting stocks after an order, order quantity should not be less than available stock

package com.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.entities.Order;
import com.entities.Pet;
import com.entities.User;
import static com.utils.UserUtils.*;
import static com.utils.PetUtils.*;
import static com.utils.OrderUtils.*;

public class PetStoreApplication {

	public static void main(String[] args) {
		User arr[] = { new User("admin", "admin"), new User("c1", "c1") };
		List<Pet> pets = new ArrayList<>();
		List<Order> orders = new ArrayList<>();
		String loggedInUser = null;
		try (Scanner sc = new Scanner(System.in)) {

			int choice;
			do {
				System.out.println("1.Login\n2.Add new Pet(Admin Only)\n3.Update Pet Details(Admin Only)"
						+ "\n4.Display All available pets\n5.Order a Pet\n6.Check order status by order Id"
						+ "\n7.Update order status(Admin only)\n0.Exit");
				choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						System.out.println("Enter LoginId, Password");
						loggedInUser = login(arr, sc.next(), sc.next());
						System.out.println(loggedInUser + " logged in successfully");
						break;
					case 2:
						addNewPet(sc, pets, loggedInUser);
						break;
					case 3:
						updatePetDetails(sc, pets, loggedInUser);
						break;
					case 4:
						displayAllPets(pets);
						break;
					case 5:
						orderPet(sc, pets, orders);
						break;
					case 6:
						checkOrderStatusById(orders, sc);
						break;
					case 7:
						updateOrderStatus(orders, sc, loggedInUser);
						break;
					case 0:
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Invalid Choice...");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			} while (choice != 0);

		}
	}
}
