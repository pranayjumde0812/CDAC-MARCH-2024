namespace ProductCrudMvc.Models
{
    public class Product
    {
        public int Id { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public double UnitPrice { get; set; }
        public string? ImageUrl { get; set; }
        public int Quantity { get; set; }


        public Product(string? title, string? description, double unitPrice, string? imageUrl, int quantity)
        {
            Title = title;
            Description = description;
            UnitPrice = unitPrice;
            ImageUrl = imageUrl;
            Quantity = quantity;
        }

        public Product(int id,string? title, string? description, double unitPrice, string? imageUrl, int quantity)
        {
            Id = id;
            Title = title;
            Description = description;
            UnitPrice = unitPrice;
            ImageUrl = imageUrl;
            Quantity = quantity;
        }
    }
}
