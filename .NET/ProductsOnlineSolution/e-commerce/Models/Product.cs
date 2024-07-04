namespace e_commerce.Models
{
    public class Product
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public string Description { get; set; }
        public double UnitPrice { get; set; }
        public string? ImageUrl {  get; set; }
        public int Quantity {  get; set; }

        public Product() { }


        public Product(int Id,string Title, string Description, double UnitPrice, string ImageUrl, int Quantity)
        {
            this.Id = Id;
            this.Title = Title;
            this.Description = Description;
            this.UnitPrice = UnitPrice;
            this.ImageUrl = ImageUrl;
            this.Quantity = Quantity;
        }
        public Product(string Title, string Description, double UnitPrice, string ImageUrl, int Quantity)
        {
            this.Title = Title;
            this.Description= Description;
            this.UnitPrice = UnitPrice;
            this.ImageUrl = ImageUrl;
            this.Quantity = Quantity;
        }

    }
}
