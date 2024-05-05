package com.app.utils;

import com.app.cms.Customer;
import com.app.custom_exception.*;
import com.app.enums.ServicePlan;

import java.time.LocalDate;
import java.util.*;

import static com.app.validations.CustomerValidation.*;

public class CustomerUtility {

    public static Map<String, Customer> acceptCustomerDetails(Map<String, Customer> list) throws IllegalArgumentException, DuplicateCustomerException, ServicePlanDetailsMisMatchedException, ServicePlanNotFoundException, NotEmailFormatException, NotAlphanumericPasswordException {

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
        list.put(customer.getEmail(), customer);

        return list;
    }

    public static Customer loginTOAccount(Map<String, Customer> list, String email, String password) throws InvalidCredentialsException {

        if (!list.containsKey(email)) {
            throw new InvalidCredentialsException("Email not registered");
        } else {
            Customer validCustomer = list.get(email);
            if (validCustomer.getPassword().equals(password)) {
                return validCustomer;
            } else throw new InvalidCredentialsException("Invalid Credentials");
        }

    }

    public static String customerUnsubscribe(Map<String, Customer> list, String email) throws InvalidCredentialsException {

        Customer customer;
        if (!list.containsKey(email)) {
            throw new InvalidCredentialsException("Not a registered customer");
        } else {
            customer = list.get(email);
            list.remove(email);
        }
        return "Customer " + customer.getFirstName() + " is unsubscribed";
    }

    public static void updatePassword(Map<String, Customer> list, String email, String oldPassword, String newPassword) throws InvalidCredentialsException, NotAlphanumericPasswordException {
        Customer customer = loginTOAccount(list, email, oldPassword);
        if (customer.getPassword().equals(oldPassword)) {
            newPassword = validatePassword(newPassword);
            customer.setPassword(newPassword);
            System.out.println("Password Updated Successfully");
        } else throw new InvalidCredentialsException("Invalid Credentials");
    }

    public static void displayAllCustomersDetails(Map<String, Customer> customers) {
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }

    public static void removeCustomerAfterGivenDob(Map<String, Customer> customerList, String date) {
        LocalDate givenDate = LocalDate.parse(date);
        Collection<Customer> customerCollection = customerList.values();
        List<Customer> list = new ArrayList<>(customerCollection);
        Iterator<Customer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getDateOfBirth().isAfter(givenDate)) {
                customerList.remove(customer.getEmail());
            }
        }
    }


    public static Map<String, Customer> populatedData() {
        Customer c1 = new Customer("Pranay", "Jumde", "p@gmail.com", "123",
                2000, LocalDate.parse("1999-08-08"), ServicePlan.valueOf("GOLD"));
        Customer c2 = new Customer("Ayush", "Gupta", "a@gmail.com", "123",
                2000, LocalDate.parse("1999-08-08"), ServicePlan.valueOf("GOLD"));
        Customer c3 = new Customer("Karshin", "Sinha", "k@gmail.com", "123",
                2000, LocalDate.parse("2001-11-12"), ServicePlan.valueOf("GOLD"));
        Customer c4 = new Customer("Sai", "Kakde", "s@gmail.com", "123",
                2000, LocalDate.parse("2001-11-12"), ServicePlan.valueOf("GOLD"));
        Customer c5 = new Customer("Prajwal", "Wandhare", "pw@gmail.com", "123",
                2000, LocalDate.parse("2000-02-02"), ServicePlan.valueOf("GOLD"));

        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put(c1.getEmail(), c1);
        customerMap.put(c2.getEmail(), c2);
        customerMap.put(c3.getEmail(), c3);
        customerMap.put(c4.getEmail(), c4);
        customerMap.put(c5.getEmail(), c5);
        return customerMap;
    }
}
