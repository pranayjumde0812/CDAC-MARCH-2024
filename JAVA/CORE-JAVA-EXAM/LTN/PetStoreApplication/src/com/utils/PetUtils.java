package com.utils;

import java.util.List;
import java.util.Scanner;

import com.entities.Category;
import com.entities.Pet;
import com.exceptions.AuthorizationException;
import com.exceptions.InvalidPetDetailsException;

public class PetUtils {

	public static void addNewPet(Scanner sc, List<Pet> petList, String loggedInUser) throws AuthorizationException {

		if (loggedInUser == null || !loggedInUser.equals("admin")) {
			throw new AuthorizationException("Not a Admin... Please ckeck again");
		} else {
			System.out.println("Enter Pet Details");
			System.out.println("PetId, Name, Category(CAT, DOG, RABBIT, FISH), UnitPrice, Stock");
			Pet pet = new Pet(sc.nextInt(), sc.next(), Category.valueOf(sc.next().toUpperCase()), sc.nextDouble(),
					sc.nextInt());
			petList.add(pet);
		}
	}

	public static void updatePetDetails(Scanner sc, List<Pet> petList, String loggedInUser)
			throws AuthorizationException, InvalidPetDetailsException {

		if (loggedInUser == null || !loggedInUser.equals("admin")) {
			throw new AuthorizationException("Not a Admin... Please ckeck again");
		} else {
			System.out.println("Enter Pet Id to update");
			Pet pet = searchPetById(petList, sc.nextInt());
			if (pet == null) {
				throw new InvalidPetDetailsException("Invalid Pet Id...Please check again");
			} else {
				System.out.println("Update pet details");
				System.out.println("Update Name");
				pet.setName(sc.next());
				System.out.println("Update Category");
				pet.setCategory(Category.valueOf(sc.next().toUpperCase()));
				System.out.println("Update UnitPrice");
				pet.setUnitPrice(sc.nextDouble());
				System.out.println("Update Stock");
				pet.setStock(sc.nextInt());

				System.out.println("PetId " + pet.getPetId() + " updated successfully");
			}
		}
	}

	public static Pet searchPetById(List<Pet> petList, int id) {
		for (Pet pet : petList) {
			if (pet.getPetId() == id) {
				return pet;
			}
		}
		return null;
	}

	public static void displayAllPets(List<Pet> petList) {
		for (Pet pet : petList) {
			System.out.println(pet);
		}
	}
}
