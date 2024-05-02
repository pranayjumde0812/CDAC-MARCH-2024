import com.app.cms.Customer;
import com.app.utils.CustomerSortDobAndLastnameComparator;

import java.util.*;

import static com.app.utils.CustomerUtility.*;

public class Main {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {
            List<Customer> customers = new ArrayList<>();
            int choice;
            do {
                System.out.println("Enter the choice");
                System.out.println("1.Sign-Up | 2.Sign-In(Login) | 3. Change Password");
                System.out.println("4.Un-subscribe | 5.Display all customers | 6. Sort customers on email");
                System.out.println("7.Sort customer on DOB and lastname | 8.Remove customer born after given date");
                System.out.println("0. Exit");
                choice = sc.nextInt();
                try {
                    switch (choice) {
                        case 1:
//                            customers = acceptCustomerDetails(customers);
//                            System.out.println("Customer register successfully");
                            customers = populatedData();
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
                            Collections.sort(customers);
                            System.out.println("Customer sorted according to email");
                            break;
                        case 7:
                            Collections.sort(customers, new CustomerSortDobAndLastnameComparator());
                            System.out.println("Customer sorted according to to DOB and Lastname");
                            break;
                        case 8:
                            System.out.println("Enter the date- yyyy-MM-dd");
                            removeCustomerAfterGivenDob(customers, sc.next());
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