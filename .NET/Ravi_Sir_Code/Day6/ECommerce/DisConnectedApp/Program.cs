using MySql.Data.MySqlClient;
using System.Data;

string connectionString = "Server=localhost;Port=3306;Database=ecommerce;User=root;Password=1311;";
MySqlConnection connection = new MySqlConnection(connectionString);
string query = "SELECT * FROM users";
try
{
    MySqlCommand mySqlCommand = connection.CreateCommand();
    mySqlCommand.CommandText = query;
    MySqlDataAdapter da= new MySqlDataAdapter(mySqlCommand);
    //MySqlDataAdapter da=new MySqlDataAdapter(query, connection);
    DataSet ds=new DataSet();
    da.Fill(ds);
    DataTable dt = ds.Tables[0];
    DataRowCollection rows = dt.Rows;
    foreach(DataRow row in rows )
    {
        int id = int.Parse(row["user_id"].ToString());
        string email = row["email"].ToString();
        string password = row["password"].ToString();
        string contactNumber = row["contact_number"].ToString();
        Console.WriteLine(id + " " + email + " " + password + " " + contactNumber);
    }
}
catch(Exception e)
{
}
Console.ReadLine();