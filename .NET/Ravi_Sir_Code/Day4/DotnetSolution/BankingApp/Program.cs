using BankingApp;

//BankingApp.EventHandler.PayIncomeTax();
//register the function 
/*
Operation opn1 = new Operation(BankingApp.EventHandler.PayIncomeTax);
Operation opn2 = new Operation(BankingApp.EventHandler.SendSMS);
Operation opn3 = new Operation(BankingApp.EventHandler.BlockAccount);

Operation masterOpn = null;

masterOpn += opn1;
masterOpn += opn2;
masterOpn += opn3;
masterOpn();

MathEngine engine=new MathEngine();
ArithmaticOperation mathOpn1 = new ArithmaticOperation(engine.Addition);
ArithmaticOperation mathOpn2 = new ArithmaticOperation(engine.Subtraction);
ArithmaticOperation mastermathOpen = null;
ArithmaticOperation masterMath=mathOpn1;

masterMath(45, 56);

//Multicast Delegate

masterMath += mathOpn2;
masterMath(445, 50);

masterMath -= mathOpn2;
masterMath(445, 50);
*/

Account acct = new Account();
acct.Balance = 56000;

//Event Registration

acct.overBalance += BankingApp.EventHandler.PayIncomeTax;
acct.overBalance += BankingApp.EventHandler.SendSMS;

acct.underBalance += BankingApp.EventHandler.BlockAccount;

//acct.Deposit(356000);
acct.Withdraw(53000);