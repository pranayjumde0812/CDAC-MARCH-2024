using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BankingApp
{
    //Compliance


    public delegate void ArithmaticOperation( int num1, int num2 );
    public delegate void Operation();


    public class MathEngine
    {
        public int result;
        public void Addition(int num1, int num2) { 
             result= num1+ num2;
        }

        public void Subtraction(int num1, int num2)
        {
            result = num1 - num2;
        }


    }
    public  class EventHandler
    {

        public static void BlockAccount()
        {
            Console.WriteLine("You account is blocked temp.");
        }

        public static void PayIncomeTax()
        {
            Console.WriteLine("20% income tax deducted.....");
        }

        public static void SendEmail()
        {

        }

        public static void SendSMS()
        {
            Console.WriteLine("You account details has been sent to sms");
        }



    }
}
