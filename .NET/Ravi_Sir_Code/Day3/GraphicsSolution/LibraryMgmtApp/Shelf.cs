using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LibraryMgmtApp
{
    public  class Shelf
    {
   
        private  List<string> books;
        public Shelf() {
            books = new List<string>();
            books.Add("Inside Windows");
            books.Add("Let us C");
            books.Add("Wings Of Fire");
        }

        //Indexer  Implementation
        //smart Array
        public string this[int index]
        {
            get {
                return books[index]; 
            }
            set {
                books[index] = value;
            }
        }

    }
}
