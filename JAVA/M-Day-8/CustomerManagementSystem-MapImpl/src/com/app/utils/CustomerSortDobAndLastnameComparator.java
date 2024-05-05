package com.app.utils;

import com.app.cms.Customer;

import java.util.Comparator;

public class CustomerSortDobAndLastnameComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer obj1, Customer obj2) {

        int result = obj1.getDateOfBirth().compareTo(obj2.getDateOfBirth());

        if (result == 0)
            return obj1.getLastName().compareTo(obj2.getLastName());

        return result;
    }
}
