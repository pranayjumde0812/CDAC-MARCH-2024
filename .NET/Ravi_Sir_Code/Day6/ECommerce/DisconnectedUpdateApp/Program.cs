using MySql.Data.MySqlClient;

using System.Data;

string connectionString = "Server=localhost;Port=3306;Database=ecommerce;User=root;Password=1311;";
MySqlConnection connection = new MySqlConnection(connectionString);
string query = "SELECT * FROM users";
try
{
    MySqlCommand mySqlCommand = connection.CreateCommand();
    mySqlCommand.CommandText = query;
    MySqlDataAdapter da = new MySqlDataAdapter(mySqlCommand);
    MySqlCommandBuilder builder= new MySqlCommandBuilder(da);
    DataSet ds = new DataSet();
    da.Fill(ds);
    DataTable dt = ds.Tables[0];
    DataRowCollection rows = dt.Rows;
    DataRow theRow=dt.NewRow();
    theRow["user_id"] = 78;
    theRow["email"]="Chaitanya.joshi@gmail.com";
    theRow["password"] = "cdac";
    theRow["contact_number"] = "9881735801";
    rows.Add(theRow);
    da.Update(ds);
}
catch (Exception e)
{
    Console.WriteLine(e.Message);
}
Console.WriteLine("Data is inserted....");
Console.ReadLine();