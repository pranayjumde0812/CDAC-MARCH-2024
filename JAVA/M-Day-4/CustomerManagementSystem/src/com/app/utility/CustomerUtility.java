package com.app.utility;

import com.app.cms.Customer;
import com.app.enums.ServicePlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerUtility {

    public static Customer acceptCustomerDetails() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last name : ");
        String lastName = scanner.next();
        System.out.println("Enter email : ");
        String email = scanner.next();
        System.out.println("Enter Password : ");
        String pass = scanner.next();
        System.out.println("Enter Date of Birth :- yyyy-MM-dd ");
        String dob = scanner.next();
        System.out.println("Enter service plan");
        String servicePlan = scanner.next();
        System.out.println("Enter Registration amount : ");
        double registrationAmount = scanner.nextDouble();

        return new Customer(firstName, lastName, email, pass, registrationAmount, LocalDate.parse(dob), ServicePlan.valueOf(servicePlan.toUpperCase()));
    }

    public static Customer checkRegisteredCustomer(ArrayList<Customer> list, String email) throws Exception {

        for (Customer customer : list) {
            if (customer != null && email.equals(customer.getEmail())) {
                return customer;
            }
        }
        throw new Exception("Email not registered");
    }

    public static String loginTOAccount(Customer customer, String password) throws Exception {
        String string = "";
        if (customer.getPassword().equals(password)) {
            string += "Login Successfully";
        } else {
            throw new Exception("Invalid Credentials");
        }
        return string;
    }

    public static String customerUnsubscribe(Customer customer) {
        customer.setSubscribed(false);
        return "Customer Unsubscribed";
    }

    public static void updatePassword(Customer customer, String oldPassword, String newPassword) throws Exception {
        if (customer.getPassword().equals(oldPassword)) {
            customer.setPassword(newPassword);
            System.out.println("Password Updated Successfully");
        } else {
            throw new Exception("Old Password is wrong !!!!!");
        }
    }

    public static void displayAllCustomersDetails(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            if (customer != null) {
//                System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getPassword());
                System.out.println(customer);
            }
        }
    }
}
