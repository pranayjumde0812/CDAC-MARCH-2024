package com.app.io;

import com.app.cms.Customer;

import java.io.*;
import java.util.Map;

public interface IoOperation {

    static void storeCustomerToFile(Map<String, Customer> customerMap, String filename) throws IOException {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename, true))) {
            out.writeObject(customerMap);
            System.out.println("Data Stored Successfully");
        }
    }

    static Map<String, Customer> readCustomerFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Map<String, Customer>) in.readObject();
        }
    }
}
