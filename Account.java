/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_project;

public class Account {

private String customerID;
private String fname;
private String lname;
private int accountNumber; 
private int pin;
private String accountType;
private double availableBalance; 
private double totalBalance;

public Account( String CustomerID, int AccountNumber, int PIN,String fname, String lname,String accType, double AvailableBalance, double TotalBalance )
{
    this.customerID = CustomerID;
    this.accountNumber = AccountNumber;
    this.pin = PIN;
    this.fname = fname;
    this.lname = lname;
    this.accountType = accType;
    this.availableBalance = AvailableBalance;
    this.totalBalance = TotalBalance;
}
public Account(){
    
}

public boolean validatePIN( int userPIN )
{
  if ( pin == userPIN ){
       return true;
}
else
{
   return false;
}
}

//public int validateAccount(int Accountnumber){
//    if (Accountnumber != Accountnumber){
//        return 0;
//    }
//    else{
//        return Accountnumber;
//    }   
//
//}

public int getAccountNumber()
   {
      return accountNumber;  
   } 
  
public void setAccountNumber(int accountnumber)
   {
      this.accountNumber = accountnumber;  
   } 
   
public String getfirstname(){
    return fname;
}

public void setfirstname(String fname){
    
    this.fname = fname;
}


public String getlastname(){
    return lname;
}

public void setlastname(String lname){
    
    this.lname = lname;
}

public String getaccountType(){
    
    return accountType;
}

public double getAvailableBalance()
{
   return availableBalance;
}

public void setAvailableBalance(double balance){
    
    this.availableBalance = balance;
}

public double getTotalBalance()
{
   return totalBalance;
}
public void setTotalBalance(double balance){
    
    this.totalBalance = balance;
}

public double depositAvailable(double amount )
{
   availableBalance += amount; 
   return availableBalance;
}

public double depositTotal(double amount )
{
   totalBalance += amount;
   
   return totalBalance;
}

public double withdrawAvailable(double amount )
{
   availableBalance -= amount; 
   
   return availableBalance;
}

public double transferAvailable(double amount )
{
   availableBalance -= amount; 
   
   return availableBalance;
}
public double withdrawTotal(double amount )
{
   totalBalance -= amount; 
   
   return  totalBalance;
}

public String getID(){
    
    return customerID;
}
 
public int getPin() {
    
	return pin;
}

public void setPin(int pin) {
    
     this.pin=pin;
}



@Override
public String toString(){
   return  "customerID"+customerID+ "pin=" + pin +"fname=" + fname +"lname"+lname + "accountNumber=" + accountNumber + "accountType =" +accountType+ "availableBalance"+availableBalance + "totalBalance"+totalBalance;
}
}

