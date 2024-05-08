import com.app.cms.Customer;
import com.app.utils.CustomerSortDobAndLastnameComparator;

import static com.app.io.IoOperation.*;

import java.util.*;

import static com.app.utils.CustomerUtility.*;

public class Main {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {
//            Map<String, Customer> customers = populatedData();
            Map<String, Customer> customers = new HashMap<>();
            int choice;

            do {
                System.out.println("Enter the choice");
                System.out.println("1.Sign-Up | 2.Sign-In(Login) | 3. Change Password");
                System.out.println("4.Un-subscribe | 5.Display all customers | 6. Sort customers on email");
                System.out.println("7.Sort customer on DOB and lastname | 8.Remove customer born after given date");
                System.out.println("9.Sort customer on DOB and lastname | 10.Remove customer born after given date");
                System.out.println("0. Exit");
                choice = sc.nextInt();
                try {
                    switch (choice) {
                        case 1:
                            acceptCustomerDetails(customers);
                            System.out.println("Customer register successfully");
                            break;
                        case 2:
                            System.out.println("Enter your Email & Password");
                            Customer customer = loginTOAccount(customers, sc.next(), sc.next());
                            System.out.println(customer);
                            break;
                        case 3:
                            System.out.println("Enter your registered Email, Old Password then Enter new Password");
                            updatePassword(customers, sc.next(), sc.next(), sc.next());
                            break;
                        case 4:
                            System.out.println("Enter customer email to unsubscribe");
                            String str = customerUnsubscribe(customers, sc.next());
                            System.out.println(str);
                            break;
                        case 5:
                            displayAllCustomersDetails(customers);
                            break;
                        case 6:
                            customers = new TreeMap<>(customers);
                            System.out.println("Customer sorted according to email");
                            displayAllCustomersDetails(customers);
                            break;
                        case 7:
                            Collection<Customer> collection = customers.values();
                            List<Customer> customerList = new ArrayList<>(collection);
                            Collections.sort(customerList, new CustomerSortDobAndLastnameComparator());
                            System.out.println("Customer sorted according to to DOB and Lastname");
                            for (Customer c : customerList) {
                                System.out.println(c);
                            }
                            break;
                        case 8:
                            System.out.println("Enter the date- yyyy-MM-dd");
                            String strDate = sc.next();
                            removeCustomerAfterGivenDob(customers, strDate);
                            System.out.println("Customer removed after date = " + strDate + "successfully.");
                            System.out.println("Remaining Customer");
                            displayAllCustomersDetails(customers);
                            break;

                        case 9:
                            System.out.println("Enter File Name : ");
                            storeCustomerToFile(customers, sc.next());
                            break;
                        case 10:
                            System.out.println("Enter file Name : ");
                            readCustomerFromFile(sc.next()).values().stream().forEach(line -> System.out.println(line));
                            break;
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