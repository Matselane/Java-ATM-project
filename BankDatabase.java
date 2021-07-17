/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_project;

import java.util.*;
/**
 *
 * @author A212565
 */
public class BankDatabase {
    
   static ArrayList<Account> accounts = new ArrayList<Account>() ; 
   
   public BankDatabase()
   {
      Account accounts1 = new Account("9099",12345, 54321,"Sam","Smith","Current", 1000.0, 1200.0);
      Account accounts2 = new Account("5215",98765, 56789,"Oratile","Walker","Savings", 2400.0, 2200.0);
      Account accounts3 = new Account("7896",19234, 43291,"Thabang","Ndlovu","Current",2200.0, 2000.0);
      Account accounts4 = new Account("9099",91011, 11109,"Janet","Jackson","Savings",5000.0, 4800.0);
      accounts.add(accounts1);
      accounts.add(accounts2);
      accounts.add(accounts3);
      accounts.add(accounts4);
   } 
   
   public Account getAccount(int accountNumber)
   {
    for ( Account Account : accounts )
   {
    if (Account.getAccountNumber()==(accountNumber)){
        return Account;
   } 
   }  
    return null;
}
   
   public Account getAccountpin(int PIN)
   {
      for (Account Acc : accounts){
      {
         if (Acc.getPin() == PIN)
            return Acc;
      } 
      }
      return null; 
   }

   public Account searchCustomer(String customerID) {
    for(Account customer : accounts) {
        if (customer.getID().equals(customerID) ) {
            return customer;
    }
    }
    return null;  
   }
   
    public Account SearchaccountType(String AccountType){
        for(Account acctype: accounts){
            if(acctype.getaccountType().equalsIgnoreCase(AccountType)){
                return acctype;
            }        
    }
        return null;
}
     public double getAvailableBalance(int accountNumber)
   {
      return getAccount(accountNumber).getAvailableBalance();
   } 
     
   public double getTotalBalance(int accountNumber)
   {
      return getAccount(accountNumber).getTotalBalance();
   } 
   
   public double depositAvailable(int accountNumber, double amount)
   {
      return getAccount(accountNumber).depositAvailable(amount);
       
   }
   
   public double depositTotal(int accountNumber, double amount)
   {
      return getAccount(accountNumber).depositTotal(amount);
      
   }
    public void withdrawAvailable(int accountNumber, double amount)
   {
      getAccount(accountNumber).withdrawAvailable(amount);
      
   } 
    
    public double withdrawTotal(int accountNumber, double amount)
   {
      return getAccount(accountNumber).withdrawTotal(amount);
   } 

  public Account Searchfirstname(String fname){
        for(Account firstname: accounts){
            if(firstname.getfirstname().equalsIgnoreCase(fname)){
                return firstname;
            }        
    }
        return null;
  }
 
 
  public double getavailable(int accountnumber){
     for(int i =0; i < accounts.size();i++){
         int elements = accounts.get(i).getAccountNumber();
         if(accountnumber == elements){
         double available = accounts.get(i).getAvailableBalance();
             return available;
         }
     }
  return 0;
}

   public double getAvailableWithdrawal(int accountnumber, int pin,double withdraw){
   for (int i =0; i< accounts.size(); i++) {  
       double withdraws = accounts.get(i).getAvailableBalance();
            double a = accounts.get(i).withdrawAvailable(withdraw);
            if (accountnumber == a) {
                int p = accounts.get(i).getPin();
                if( pin == p) {
                    accounts.get(i).withdrawAvailable(p);
                    return withdraws;
                }
   }
   }  
     return 0;

//for (Account withdrawals:accounts){
//       if(withdraw <= accountnumber){
//           withdraw = withdrawals.getAvailableBalance();
//           return withdrawals;
//   }
//   }  
//     return null;


   } 
   
   
    
   public double getAvailablenewBalance(int accountnumber){
       for (int i= 0; i< accounts.size(); i++){
          int elements = accounts.get(i).getAccountNumber();
          if(accountnumber == elements){
             double newBalance = accounts.get(i).getAvailableBalance();
             return newBalance;
          }
          
       }
        return 0;
       }

   
   public double getAvailableDeposit(int accountnumber,double deposits){
//       for (int i =0; i<accounts.size(); i++) {  
//       double deposit = accounts.get(i).getAvailableBalance();
//            double a = accounts.get(i).depositAvailable(deposit);
//            if (accountnumber == a) {
//                int p = accounts.get(i).getPin();
//                if( pin == p) {
//                    accounts.get(i).depositAvailable(p);
//                    return deposit;
//                }
//   }
//   }  
//     return 0;
//   }
for (int i= 0; i< accounts.size(); i++){
          int elements = accounts.get(i).getAccountNumber();
          if(accountnumber == elements){
             double deposit = accounts.get(i).depositAvailable(deposits);
             return deposit;
          }
          
       }
        return 0;
       }
   
  

  public int authenticateAccount(int Accountn){
for(int i =0; i < accounts.size();i++){
    int element = accounts.get(i).getAccountNumber();
    if(Accountn == element){
        return Accountn;
    }
    
}
return 0;
 
  }
public String getFirstname(String fname, int accountnumber){
   for (int i= 0; i< accounts.size(); i++){
          int elements = accounts.get(i).getAccountNumber();
          if(accountnumber == elements){
             String firstname = accounts.get(i).getfirstname();
             return firstname;
          }
          
       }
        return null;
       }

public String getLastname(String lname, int accountnumber){
   for (int i= 0; i< accounts.size(); i++){
          int elements = accounts.get(i).getAccountNumber();
          if(accountnumber == elements){
             String lastname = accounts.get(i).getlastname();
             return lastname;
          }
          
       }
        return null;
       }

public String getaccounttype(String type, int accountnumber){
   for (int i= 0; i< accounts.size(); i++){
          int elements = accounts.get(i).getAccountNumber();
          if(accountnumber == elements){
             String accounttype = accounts.get(i).getaccountType();
             return accounttype;
          }
          
       }
        return null;
       }

public int getAccnum(int account){
    //int elements =0;
    for(int i=0; i<accounts.size(); i++){
      int elements = accounts.get(i).getAccountNumber();
        if(elements == account){
            return elements;
        }
    }
    return 0;
}

public double getAvailableTransfer(int accountnumber, double transfers){
    for (int i= 0; i< accounts.size(); i++){
          int elements = accounts.get(i).getAccountNumber();
          if(accountnumber == elements){
             double transfer = accounts.get(i).transferAvailable(transfers);
             return transfer;
          }
          
       }
        return 0;
       }
}