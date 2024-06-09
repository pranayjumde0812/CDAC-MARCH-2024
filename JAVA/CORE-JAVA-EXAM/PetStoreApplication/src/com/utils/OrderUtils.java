package com.utils;

import static com.utils.PetUtils.searchPetById;

import java.util.List;
import java.util.Scanner;

import com.entities.Order;
import com.entities.Pet;
import com.entities.Status;
import com.exceptions.AuthorizationException;
import com.exceptions.InvalidOrderDetailsException;
import com.exceptions.InvalidPetDetailsException;
import com.exceptions.OutOfStockException;

public class OrderUtils {

	public static void orderPet(Scanner sc, List<Pet> petList, List<Order> orderList)
			throws InvalidPetDetailsException, OutOfStockException {
		System.out.println("Enter details to Order Pet");
		System.out.println("Enter PetId ");
		Pet searchPetById = searchPetById(petList, sc.nextInt());
		if (searchPetById == null)
			throw new InvalidPetDetailsException("Invalid Pet Id");

		System.out.println("Enter Quantity to buy : ");
		int quantity = sc.nextInt();
		if (searchPetById.getStock() < quantity)
			throw new OutOfStockException("The required stock of item is not availabe to complete this order");

		Order order = new Order(searchPetById.getPetId(), quantity, Status.IN_PROCESS);
		searchPetById.setStock(searchPetById.getStock() - quantity);

		orderList.add(order);

	}

	public static void checkOrderStatusById(List<Order> orderList, Scanner sc) throws InvalidOrderDetailsException {
		System.out.println("Enter OrderId : ");
		Order searchOrderById = searchOrderById(orderList, sc.nextInt());
		if (searchOrderById == null)
			throw new InvalidOrderDetailsException("Invalid Order Id... Please check again");

		System.out.println(
				"The status of your OrderId = " + searchOrderById.getOrderId() + " is " + searchOrderById.getStatus());
	}

	public static Order searchOrderById(List<Order> orderList, int orderId) {

		for (Order order : orderList) {
			if (order.getOrderId() == orderId) {
				return order;
			}
		}

		return null;
	}

	public static void updateOrderStatus(List<Order> orderList, Scanner sc, String loggedInUser)
			throws InvalidOrderDetailsException, AuthorizationException {

		if (loggedInUser == null || !loggedInUser.equals("admin"))
			throw new AuthorizationException("Not a Admin... Please ckeck again");

		System.out.println("Enter OrderId : ");
		Order searchOrderById = searchOrderById(orderList, sc.nextInt());
		if (searchOrderById == null)
			throw new InvalidOrderDetailsException("Invalid Order Id... Please check again");

		System.out.println("Enter Updated status(PLACED, IN_PROCESS, COMPLETED)");
		searchOrderById.setStatus(Status.valueOf(sc.next().toUpperCase()));

		System.out.println("Status updated successfully");
	}

}
