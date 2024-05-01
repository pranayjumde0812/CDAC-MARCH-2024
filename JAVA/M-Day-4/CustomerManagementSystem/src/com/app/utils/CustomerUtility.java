package com.app.utils;

import com.app.cms.Customer;
import com.app.custom_exception.DuplicateCustomerException;
import com.app.custom_exception.NotEmailFormatException;
import com.app.custom_exception.ServicePlanDetailsMisMatchedException;
import com.app.custom_exception.ServicePlanNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.app.validations.CustomerValidation.validAllInputs;

public class CustomerUtility {

    public static List<Customer> acceptCustomerDetails(List<Customer> list) throws IllegalArgumentException, DuplicateCustomerException, ServicePlanDetailsMisMatchedException, ServicePlanNotFoundException, NotEmailFormatException {

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
        return list;
    }

    public static Customer checkRegisteredCustomer(List<Customer> list, String email) throws Exception {

//        for (Customer customer : list) {
//            if (customer != null && email.equals(customer.getEmail())) {
//                return customer;
//            }
//        }

        Customer customer = new Customer(email);
        if (list.contains(customer)) {
            return list.get(list.indexOf(customer));
        }
        throw new Exception("Email not registered");
    }

    public static Customer loginTOAccount(Customer customer, String password) throws Exception {
        if (customer.getPassword().equals(password)) {
            return customer;
        }
        throw new Exception("Invalid Credentials");
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
