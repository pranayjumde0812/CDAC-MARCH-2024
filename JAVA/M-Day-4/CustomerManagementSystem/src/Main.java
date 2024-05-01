import com.app.cms.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.app.utils.CustomerUtility.*;

public class Main {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {
            List<Customer> customers = new ArrayList<>();
            int choice;
            do {
                System.out.println("Enter the choice");
                System.out.println("1.Sign-Up | 2.Sign-In(Login) | 3. Change Password");
                System.out.println("4.Un-subscribe | 5.Display all customers | 0. Exit");
                choice = sc.nextInt();
                try {
                    switch (choice) {
                        case 1:
                            customers = acceptCustomerDetails(customers);
                            System.out.println("Customer register successfully");
                            break;
                        case 2:
                            System.out.println("Enter your Email");
                            Customer cust = checkRegisteredCustomer(customers, sc.next());
                            System.out.println("Enter your Password");
                            cust = loginTOAccount(cust, sc.next());
                            System.out.println(cust);

                            break;
                        case 3:
                            System.out.println("Enter your registered Email");
                            Customer cust1 = checkRegisteredCustomer(customers, sc.next());
                            System.out.println("Enter Old Password then Enter new Password");
                            updatePassword(cust1, sc.next(), sc.next());

                            break;
//                        case 4:
//                            System.out.println("Enter customer email to unsubscribe");
//                            Customer c = checkRegisteredCustomer(customers, sc.next());
//                            String str = customerUnsubscribe(c);
//                            System.out.println(str);
//                            break;
//                        case 5:
//                            displayAllCustomersDetails(customers);
//                            break;
                        case 0:
                            System.out.println("Exiting.....");
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    sc.nextLine();
                }
            } while (choice != 0);
        } // end of try with resource
    }
}