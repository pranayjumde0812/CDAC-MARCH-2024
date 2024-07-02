using OnlineShoppingWeb;

var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();


app.MapGet("/hello", () =>
{  
    return "Welcome to asp.net ";
});

app.MapGet("/bye", () =>
{
    return "Your are now web developer. All the best ";
});

app.MapGet("/api/products", () =>
{
    //Annonymous Type
    List<Product> products = new List<Product>();
    var product1 = new Product
    {
        Id = 12,
        Title = "Gerbera",
        Description = "Wedding Flower",
        UnitPrice = 14.5

    };
    var product2 = new Product
    {
        Id = 12,
        Title = "Gerbera",
        Description = "Wedding Flower",
        UnitPrice = 14.5

    };
    products.Add(product1);
    products.Add(product2);
    return products;
});

app.MapGet("/api/products/details", () =>
{
    //Annonymous Type

    var product = new Product
    {
        Id = 12,
        Title = "Gerbera",
        Description = "Wedding Flower",
        UnitPrice = 14.5

    };

    

    return product;
});

app.Run();