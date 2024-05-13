import com.voting.dao.UserDao;
import com.voting.dao.dao_impl.UserDaoImpl;
import com.voting.model.User;

import java.util.Scanner;

public class VoterApplication {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            UserDao userDao = new UserDaoImpl();
            boolean exit = false;
            do {
                System.out.println("Enter Your Choice : ");
                System.out.println("1. Log In \n2. Signup \n3. Change Password \n4. ");
                try {
                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("Enter Email And Password to LogIn to System");
                            User user = userDao.signIn(sc.next(), sc.next());
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } while (!exit);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}