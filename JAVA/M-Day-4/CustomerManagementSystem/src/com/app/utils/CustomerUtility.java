package com.app.utils;

import com.app.cms.Customer;
import com.app.custom_exception.*;

import java.util.List;
import java.util.Scanner;

import static com.app.validations.CustomerValidation.*;

public class CustomerUtility {

    public static List<Customer> acceptCustomerDetails(List<Customer> list) throws IllegalArgumentException, DuplicateCustomerException, ServicePlanDetailsMisMatchedException, ServicePlanNotFoundException, NotEmailFormatException, NotAlphanumericPasswordException {

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

        Customer customer = validAllInputs(firstName, lastName, email, pass, registrationAmount, dob, servicePlan, list);
        list.add(customer);
//        scanner.close();
        return list;
    }

    public static Customer checkRegisteredCustomer(List<Customer> list, String email) throws InvalidCredentialsException {

//        for (Customer customer : list) {
//            if (customer != null && email.equals(customer.getEmail())) {
//                return customer;
//            }
//        }

        Customer customer = new Customer(email);
        if (list.contains(customer)) {
            return list.get(list.indexOf(customer));
        }
        throw new InvalidCredentialsException("Email not registered");
    }

    public static Customer loginTOAccount(List<Customer> list, String email, String password) throws InvalidCredentialsException {
//        Customer customer = checkRegisteredCustomer(list, email);
//        if (customer.getPassword().equals(password)) {
//            return customer;
//        }                                                  // this logic will increase time complexity
//        throw new InvalidCredentialsException("Invalid Credentials");

        // this is fast performance logic
        Customer newCustomer = new Customer(email);
        int index = list.indexOf(newCustomer); // TC: O(n)
        if (index == -1) {
            throw new InvalidCredentialsException("Email not registered");
        } else {
            Customer validCustomer = list.get(index); // TC: O(1)
            if (validCustomer.getPassword().equals(password)) {
                return validCustomer;
            } else throw new InvalidCredentialsException("Invalid Credentials");
        }

    }

    public static String customerUnsubscribe(List<Customer> list, String email) throws InvalidCredentialsException {
//        Customer customer = checkRegisteredCustomer(list, email);
//        list.remove(list.indexOf(customer));
        Customer foundCustomer;
        Customer customer = new Customer(email);
        int index = list.indexOf(customer); // TC: O(n)
        if (index == -1) {
            throw new InvalidCredentialsException("Not a registered customer");
        } else {
            foundCustomer = list.get(index); // TC: O(1)
            list.remove(foundCustomer);
        }
        return "Customer " + foundCustomer.getFirstName() + " is unsubscribed";
    }

    public static void updatePassword(List<Customer> list, String email, String oldPassword, String newPassword) throws InvalidCredentialsException, NotAlphanumericPasswordException {
        Customer customer = loginTOAccount(list, email, oldPassword);
        if (customer.getPassword().equals(oldPassword)) {
            newPassword = validatePassword(newPassword);
            customer.setPassword(newPassword);
            System.out.println("Password Updated Successfully");
        } else throw new InvalidCredentialsException("Invalid Credentials");
    }

    public static void displayAllCustomersDetails(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
