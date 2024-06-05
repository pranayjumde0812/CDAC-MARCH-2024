package com.app.cms;

import com.app.enums.ServicePlan;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {

    private int uuid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private double registrationAmount;
    private LocalDate dateOfBirth;
    private ServicePlan servicePlan;
    private boolean isSubscribed;

    private static int objCount;

    static {
        objCount = 0;
    }

    public Customer() {
        this.uuid = ++objCount;
        this.isSubscribed = true;
    }

    public Customer(String firstName, String lastName, String email, String password, double registrationAmount, LocalDate dateOfBirth, ServicePlan servicePlan) {
        this.uuid = ++objCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.registrationAmount = registrationAmount;
        this.dateOfBirth = dateOfBirth;
        this.servicePlan = servicePlan;
        this.isSubscribed = true;
    }

    public Customer(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRegistrationAmount() {
        return registrationAmount;
    }

    public void setRegistrationAmount(double registrationAmount) {
        this.registrationAmount = registrationAmount;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ServicePlan getServicePlan() {
        return servicePlan;
    }

    public void setServicePlan(String servicePlan) {
        this.servicePlan = ServicePlan.valueOf(servicePlan);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getUuid() {
        return uuid;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    @Override
    public String toString() {
        return "uuid=" + uuid + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + ", registrationAmount=" + registrationAmount + ", dateOfBirth=" + dateOfBirth + ", servicePlan='" + servicePlan;
    }


    @Override
    public boolean equals(Object object) {
        if (object instanceof Customer) {
            Customer customer = (Customer) object;
            return this.email.equals(customer.getEmail());
        }
        return false;
    }

    @Override
    public int compareTo(Customer customer) {
        return this.email.compareTo(customer.getEmail());
    }
}
