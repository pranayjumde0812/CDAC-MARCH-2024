using MySql.Data.MySqlClient;
using System.Data;



    string connectionString = "Server=localhost;Port=3306;Database=ecommerce;User=root;Password=1311;";
    MySqlConnection connection = new MySqlConnection(connectionString);

    try
    {
    connection.Open();
    string query = "SELECT * FROM users;";
    MySqlCommand command = connection.CreateCommand();
    command.CommandText = query;
    MySqlDataReader  reader= command.ExecuteReader();
    while (reader.Read())
    {
        int id=reader.GetInt32("user_id");
        string email=reader.GetString("email");
        string password=reader.GetString("password");
        string contactNumber = reader.GetString("contact_number");
        Console.WriteLine(id + " " +  email + " " + password + " "+ contactNumber);
    }
    reader.Close();
}

catch(MySqlException e)
{

}

finally
{
    if(connection.State != ConnectionState.Closed)
    connection.Close();
}

Console.ReadLine();