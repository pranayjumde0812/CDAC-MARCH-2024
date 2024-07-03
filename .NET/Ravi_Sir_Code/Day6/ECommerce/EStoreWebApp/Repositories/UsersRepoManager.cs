using EStoreWebApp.Models;
using System.Data;
using MySql.Data.MySqlClient;

namespace EStoreWebApp.Repositories
{
    public static class UsersRepoManager
    {
        public static bool Delete(int id)
        {
            bool status = false;
            //code to delete user
            return status;
        }

        public static User GetUser(int id)
        {
            User user = null;
            //code segment
            return user;
        }

        public static  List<User> GetUsers()
        {
            List<User> users = new List<User>();
            string connectionString = "Server=localhost;Port=3306;Database=ecommerce;User=root;Password=1311;";
            MySqlConnection connection = new MySqlConnection(connectionString);
            try
            {
                connection.Open();
                string query = "SELECT * FROM users;";
                MySqlCommand command = connection.CreateCommand();
                command.CommandText = query;
                MySqlDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    int id = reader.GetInt32("user_id");
                    string email = reader.GetString("email");
                    string password = reader.GetString("password");
                    string contactNumber = reader.GetString("contact_number");
                    User user = new User();
                    user.Id = id;
                    user.Email = email;
                    user.ContactNumber = contactNumber;
                    user.Password = password;
                    users.Add(user);

                }
                reader.Close();
            }

            catch (MySqlException e)
            {

            }

            finally
            {
                if (connection.State != ConnectionState.Closed)
                    connection.Close();
            }
            return users;
        }

        public static bool Insert(User user)
        {

            return true;
        }

        public static  bool Update(User user)
        {
            return false;

        }
    }
}
